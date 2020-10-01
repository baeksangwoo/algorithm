package practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class ApartMoney {

    public int[] solution(int day, int k) {

        int[] answers = {};
        String answer ="";
        LocalDate targetTime = LocalDate.of(2015,1,1);
        //1월 1일에 해당하는 값은 4이다 2015/1/1일은
        //but 인풋값 day는 다르다

        int diffence = 0;
        int values = targetTime.getDayOfWeek().getValue()-1;
        int temp = 0;
        if(values ==0){
            answer = "MON";
        }else if(values ==1){
            answer = "TUE";
        }else if(values ==2){
            answer = "WED";
        }else if(values ==3){
            answer = "THU";
        }else if(values ==4){
            answer = "FRI";
        }else if(values ==5){
            answer = "SAT";
        }else if(values ==6){
            answer = "SUN";
        }

        diffence = day -values;
        if(diffence<0){
            diffence*=-1;
        }

        List<Integer> temps = new ArrayList<Integer>();
        for(int i=1;i<=12;i++){
            targetTime = LocalDate.of(2015,i,k);
            temp = (targetTime.getDayOfWeek().getValue()-1+diffence)%7;

            if(temp==5 || temp==6){
                temps.add(1);
            }else {
                temps.add(0);
            }
        }
        answers = new int[12];
        for(int i=0;i<12;i++){
            answers[i] = temps.get(i);
        }
        return answers;
    }

    public static void main(String[] args) {
            ApartMoney bts = new ApartMoney();
            int day =6;
            int k = 1;
        System.out.println(Arrays.toString(bts.solution(day,k)));
    }
}
