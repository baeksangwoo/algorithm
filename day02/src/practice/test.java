package practice;

public class test {

    String solution(String m,String k){
        String answer = "";
        //abcde
        //acde

        char temp='a';
        int [] tempArr= new int[k.length()];
        StringBuilder anwer = new StringBuilder(m);

        for(int i=0;i<m.length();i++) {

            for(int j=0;j<k.length();j++){
                if(m.charAt(i)==temp){
                    m= m.replaceFirst(String.valueOf(temp),"");
                    break;
                }
            }
            answer = answer.trim();

        }
        answer= String.valueOf(anwer);
        answer=m;

//기댓갑 cdbc
//cbbcdc
        //cbcdc
        //bcdc
        return answer;
    }


    public static void main(String[] args) {
            test bts =new test();
            String m ="kkaxbycyz";
            String n = "abc";

            bts.solution(m,n);
    }
}
