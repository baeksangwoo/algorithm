package day04;

public class StringArrConverInt {

    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0)=='+'){
            answer = Integer.parseInt(s.substring(1,s.length()));
        }else if(s.charAt(0)=='-'){
            answer = -1*Integer.parseInt(s.substring(1,s.length()));
        }else{
            answer = Integer.parseInt(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        StringArrConverInt bts = new StringArrConverInt();
        String s = "+333";
        System.out.println(bts.solution(s));
    }
}
