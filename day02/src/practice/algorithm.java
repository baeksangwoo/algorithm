package practice;
import java.lang.reflect.Array;
import java.util.*;
public class algorithm {

    public int solution(int[][] customer) {
        int answer = 0;

        int tmpX=0;
        int tmpY=0;


        for(int i=0;i<customer.length;i++){
            if(i==0){
                tmpX = customer[i][0];
                tmpY = customer[i][1];
            }else {
                if(tmpY>customer[i][0]) {
                    tmpY=customer[i][1];
                }else{

                }
            }


        }

        return answer;
    }

    public static void main(String[] args) {
            algorithm bts = new algorithm();
        int [][] v ={{1,4},{3,5},{8,10}};
        System.out.println(bts.solution(v));
    }
}
