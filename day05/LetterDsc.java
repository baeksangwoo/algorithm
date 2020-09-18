package practice;
import java.util.*;
public class LetterDsc {

    public String solution(String s) {
        String answer = "";

        //정렬이 되는 것 list

        List list = new ArrayList();
        for(int i = 0 ;i<s.length(); i++){
            list.add(s.charAt(i));
        }
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
        String temp ="";
        for(int i=0 ; i<s.length();i++){

            char tmp = (char)list.get(i);

            answer +=tmp;
        }

        return answer;
    }

    public static void main(String[] args) {

        LetterDsc bts = new LetterDsc();
        String s = "Zbcdefg";
        System.out.println(bts.solution(s));
    }
}
