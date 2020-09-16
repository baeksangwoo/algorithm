package day03;
import java.util.*;
public class divition {

    public int[] solution(int[] arr, int divisor) {


        Arrays.sort(arr);

        List<Integer> save = new ArrayList<>();

        for(int i=0;i <arr.length;i++){
            if(arr[i]%divisor ==0){
                save.add(arr[i]);
            }
        }
        if(save.size() == 0){
            int[] answer = {-1};
            return answer;
        }
        else{
            int[] answer = save.stream().mapToInt(i->i).toArray();
            return answer;
        }

    }

    public static void main(String[] args) {

        divition btn = new divition();

        int [] arr = {5, 9, 7, 10};
        int div =5;

        System.out.println(Arrays.toString(btn.solution(arr,div)));
        Arrays.toString(btn.solution(arr,div));

    }
}
