package day03;
import java.util.*;
public class Exer {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        answer = n-lost.length;
        HashMap used = new HashMap();

        //잃어버린 사람이 여분이 있는 사람일때!

        // 잃어버린 사람의 값을 처음 부터 가져온다. 첫번째 카운트
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
               //만약 같은 사람이 잃어버리고 여분이 있는 사람이면


                if(reserve[j]==lost[i]+1 || reserve[j]==lost[i]-1){
                    if(used.get(j)!="__") {
                        answer++;
                        used.put(j,"__");
                        break;
                    }else{
                        break;
                    }
                }else if(reserve[j]==lost[i]){
                    answer--;
                    used.put(j,"__");
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Exer btn = new Exer();
        int n =5;
        int [] lost ={2, 4};
        int [] reserve = {1,3,5};
        btn.solution(n,lost,reserve);
        System.out.println(btn.solution(n,lost,reserve));
    }
}
