package day03;

public class PandY {
    boolean solution(String s) {
        boolean answer = true;


        String low= s.toLowerCase();


        int numP=0;
        int numY=0;

        for(int i=0;i<s.length();i++){
            if(low.charAt(i)== 'p'){
                numP++;
            }else if(low.charAt(i)=='y'){
                numY++;
            }

        }
        if(numP == numY){
            answer =true;
        }else{
            answer =false;
        }

        return answer;
    }
    public static void main(String[] args) {

        PandY btn = new PandY();
        String s ="pPoooyY";
        btn.solution(s);

    }
}
