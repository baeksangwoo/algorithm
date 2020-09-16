package day02;
import java.lang.reflect.Array;
import  java.util.*;
public class Knumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int i=0;
        int j=0;
        int k=0;


        for(int q=0;q<commands.length;q++){
            //3개 돌린다.
             i=commands[q][0];
             j=commands[q][1];
             k=commands[q][2];

            System.out.println("i="+i + " j="+j+" k="+k);
            List firstArray= new ArrayList();
            int[] tmpArr = Arrays.copyOfRange(array,i-1,j);//인덱스
            Arrays.sort(tmpArr);
            answer[q]=tmpArr[k-1];

        }

        return answer;
    }

    public static void main(String[] args) {

        Knumber obj = new Knumber();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3} };

       // Arrays.toString(obj.solution(array,commands));
        System.out.println(Arrays.toString(obj.solution(array,commands)));
        //[5,6,3]
    }
}
