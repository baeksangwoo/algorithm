package practice;
import java.util.*;
public class DFSpractice {

    public int solution(int[] numbers, int target) {
        int answer = 0;
        //두가지 상태가 존재함 +나 -냐
        boolean[] trueList= new boolean[numbers.length];

        for(int i=0;i<Math.pow(2,numbers.length);i++){
            //+,+,+,+,- 이렇게 가는 순간 모든 경우의의 수를 생각해야함
            //2^2 2의 n승개의 조건이 필요하다
            //2의 n승만큼 도는 for문
            for(int j=0;j<numbers.length;j++){

            }

        }


        return answer;
    }

    public static void main(String[] args) {
        DFSpractice bts = new DFSpractice();
        int [] numbers= {1,1,1,1,1};
        int target = 3;
        bts.solution(numbers,target);
    }
}
