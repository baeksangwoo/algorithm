package day03;
import java.util.*;
public class StringArr {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<strings.length;i++){

            strings[i].substring(n,n+1);
            String tempString = strings[i].substring(n,n+1)+strings[i];
            arr.add(tempString);
        }
        Collections.sort(arr);

        answer = new String[arr.size()];
        for(int j=0;j<arr.size();j++){
            answer[j] = arr.get(j).substring(1, arr.get(j).length());
        }



        return answer;
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if(s1.charAt(n) > s2.charAt(n)){
//                    return 1;
//                }else if (s1.charAt(n) == s2.charAt(n)){
//                    return s1.compareTo(s2);
//                }else if (s1.charAt(n) < s2.charAt(n)){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });
//
//        return strings;
    }

    public static void main(String[] args) {

        StringArr btr = new StringArr();

        String [] strings ={"sun", "bed", "car"};
        int n = 1;

        System.out.println(Arrays.toString(btr.solution(strings,n)));

    }

}
