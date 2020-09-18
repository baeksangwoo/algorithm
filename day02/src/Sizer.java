
import java.util.*;
public class Sizer {
    public String solution(String s, int n) {
        String answer = "";
        List view = new ArrayList();
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            System.out.println((int)temp);
            if((int)temp==32){

            }else if((int)temp>=65 && (int)temp<=90){
                temp+=n;
                if((int)temp>90){
                    temp-=26;
                }

            }else if((int)temp>=97 && (int)temp<=122){
                temp+=n;
                if((int)temp>122){
                    temp-=26;
                }
            }
            view.add(temp);
        }
        for(int i=0;i<view.size();i++){
            answer += view.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Sizer bts = new Sizer();
        String s ="ABZ za";
        int n = 1;
        System.out.println(bts.solution(s, n));
    }

}
