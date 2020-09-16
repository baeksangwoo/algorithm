package practice;

public class letterCompare {

    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() ==6){
            answer = s.matches("(^[0-9]*$)");
        }else{
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {

        letterCompare bts = new letterCompare();

        String s = "1234";
        bts.solution(s);
        System.out.println(bts.solution(s));
    }

}
