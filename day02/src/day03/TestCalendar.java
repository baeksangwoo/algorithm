package day03;
import java.time.LocalDate;
public class TestCalendar {

    public String solution(int a, int b) {
        String answer = "";

        LocalDate targetTime = LocalDate.of(2016,1,1);
        int values = targetTime.getDayOfWeek().getValue();
        String days = targetTime.getDayOfWeek().toString().substring(0,3);

        System.out.println(days);

        if(values ==1){
            answer = "MON";
        }else if(values ==2){
            answer = "TUE";
        }else if(values ==3){
            answer = "WED";
        }else if(values ==4){
            answer = "THU";
        }else if(values ==5){
            answer = "FRI";
        }else if(values ==6){
            answer = "SAT";
        }else if(values ==7){
            answer = "SUN";
        }

        return answer;
    }


    public static void main(String[] args) {

        TestCalendar btr = new TestCalendar();
        int a = 2;
        int b = 14;
        System.out.println(btr.solution(a,b));

    }

}
