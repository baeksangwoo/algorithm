package day02;
import java.lang.reflect.Array;
import  java.util.*;

public class Solution02 {


    public int[] solution(int[] answers) {

        //1. 수포자 1,2,3을 정의한다.
        //2. 수포자 1,2,3과 정답을 준비한다.
        //3. 수포자 1,2,3과 정답을 비교한다.

        //1번째는 1,2,3,4,5 5개 세트
        //2번째는 2,1,2,3,2,4,2,5 8개 세트
        //3번째는 3,3,1,1,2,2,4,4,5,5 10개 세트
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            //수포자 3명
            //index 0, 1, 2
            list.add(0);

        }


        HashMap<Integer, Integer> hashMap = new HashMap();

        int iOne = 0;

        for (Integer t : answers) {
            hashMap.put(1, hashMap.getOrDefault(1, 0));
            hashMap.put(2, hashMap.getOrDefault(2, 0));
            hashMap.put(3, hashMap.getOrDefault(3, 0));
            if (pattern1[iOne % 5] == t) {
                hashMap.put(1, hashMap.getOrDefault(1, 0) + 1);
            }

            if (pattern2[iOne % 8] == t) {
                hashMap.put(2, hashMap.getOrDefault(2, 0) + 1);
            }

            if (pattern3[iOne % 10] == t) {
                hashMap.put(3, hashMap.getOrDefault(3, 0) + 1);
            }
            iOne++;
        }
        int one = 0;
        int two = 0;
        int three = 0;
        for (int key : hashMap.keySet()) {
            if (key == 1) {
                one = hashMap.get(1);
            }
            if (key == 2) {
                two = hashMap.get(2);

            }
            if (key == 3) {
                three = hashMap.get(3);

            }
        }


        // 가장 많은 것을 구하는 것
        int array1[] = {one, two, three};


        List<Integer> array2 = new ArrayList<Integer>();
        for(int i = 0;i<3;i++) {
            array2.add(0);
        }
        // 가장 많은 것을 구하는 것
        array2.set(0, one);
        array2.set(1, two);
        array2.set(2, three);
        int max = Collections.max(array2);
        System.out.println("max="+max);
        System.out.println("list="+array2);


        List<Integer> returnList = new ArrayList<Integer>();
        for (int i = 0; i < array2.size(); i++) {
            if (max == array2.get(i)) {
                returnList.add(i + 1);
            }
        }

        System.out.println("return list="+returnList);
        int[] answer = new int[returnList.size()];
        for (int i = 0; i < returnList.size(); i++) {
            answer[i] = returnList.get(i);

        }
        return answer;


//        Arrays.sort(array1);
//
//        if(array1[array1.length-1] == array1[0])
//        {
//            //다같은것
//            answers = new int[]{1, 2, 3};
//        }else if(array1[0] == array1[1]) {
//            //두명이 높은 것
//
//        }else{
//            //1명이 높은 것
//            if(array1[0]== one){
//        }
//
//        System.out.println(array1[0]);
//
//        if(one == two && two == three && one == three){
//            answer = new int[]{1, 2, 3};
//        } //모두 같을 때
//        if(one == two && two == three && one == three){
//            answer = new int[]{1, 2, 3};
//        } // 1번과 2번이 제일 많을 때
//        if(one == two && two == three && one == three){
//            answer = new int[]{1, 2, 3};
//        }
//        if(one == two && two == three && one == three){
//            answer = new int[]{1, 2, 3};
//        }
//            return answer;
//        }
    }

    public static void main(String[] args) {

        Solution02 obj = new Solution02();

        int [] arr = {1,2,3,4,5};

        obj.solution(arr);

        int [] arr2 = {1,3,2,4,2};

        obj.solution(arr2);
    }
}
