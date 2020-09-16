package day02;
import  java.util.*;
public class array {



    public static void main(String[] args) {



    }
}


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //동명이인이 있다! 중복을 허용한다.
        //set은 제외한다.
        //List , Array의 정렬

        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0; //0번지부터 진행한다.
        while(completion[i] != participant[i]){
            i++;
        }
        //여기에는 순서를 두어서 사용자를 구분했다.


        int result = 0;
        if(result == 1){
            answer = "\""+completion[i]+"\""+"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.";
        }else if(result == 2){
            answer = "\""+completion[i]+"\""+"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.";
        }else if(result ==3){
            answer = "\""+completion[i]+"\""+"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.";
        }


        return answer;
    }
}
