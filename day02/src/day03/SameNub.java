package day03;
import java.util.*;
public class SameNub {
    public int[] solution(int []arr) {


//        //연속된 중복을 제거한다. 배열의 길이?
//        int same = 0;
//        int irr = -1;
//
//        int [] save = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++){
//            if (same == arr[i]) {
//                //넘어가~
//            } else {
//                same = arr[i];
//                save[irr] = same;
//                irr++;
//            }
//        }
//        int [] answer = new int[irr];
//
//        for(int q=0;q<irr;q++){
//            answer[q] = save[q];
//        }


        //int [] arr 을 ArrayList로 for문을 사용하여 담는다.
        List<Integer> list = new ArrayList<>();

        int temp = -1;//임시값을 -1로 초기화
        for (int i: arr) {
            if(temp != i){
                temp = i;
                list.add(temp);
            }

        }
        int [] answer = list.stream().mapToInt(i->i).toArray();
        //람다 표현식


        return answer;
    }
    public static void main(String[] args) {
            SameNub obj = new SameNub();
        int [] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(obj.solution(arr)));
    }
}
