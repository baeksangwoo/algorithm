package day03;
import java.util.*;
public class EvenOdd {

    public String solution(String s) {
        String answer = "";
        if(s.length()%2 == 0){
            //두개를 뽑자 4자리  0123
            System.out.println("짝수");
            String sub = s.substring((s.length()/2)-1,(s.length()/2+1));

            answer = sub;
        }else {
            //한개를 뽑자 3이면 1 012
            System.out.println("홀수");
            char c = s.charAt(s.length()/2);
            System.out.println(c);
           String sub = s.substring(s.length()/2,s.length()/2+1);
            answer = sub;
        }
        return answer;
    }

    public static void main(String[] args) {

            EvenOdd obj = new EvenOdd();

            String s = "abcde";
            System.out.println(obj.solution(s));

            String d = "abcd";
            System.out.println(obj.solution(d));


    }
}
