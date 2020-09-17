package day04;

public class SeoulFindKim {

    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0;i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer= "김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        SeoulFindKim bts = new SeoulFindKim();

        String [] seoul={"Jane","ddddd", "dddd","Kim","dddd"};
        bts.solution(seoul);
        System.out.println(bts.solution(seoul));
    }
}
