package day04;

public class WaterMelon {

    public String solution(int n) {
        String answer = "";

        for(int i=1;i<=n;i++){
            if(i%2==1){
                answer +="수";
            }else {
                answer +="박";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
            WaterMelon bts = new WaterMelon();
            int n=3;
        System.out.println(bts.solution(n));
    }
}
