package day03;

public class AddNum {
    public long solution(int a, int b) {
        long answer = 0;
//        //-3 ~ 4
//        int val=0;
//        if(a> b){
//            //-3 ~ 4 라면  -3 -2 -1 0 1 2 3 4 5
//            for(int nm=b;nm <= a;nm++){
//               val +=nm;
//            }
//            answer = val;
//        }
//        if(b> a){
//            //-3 ~ 4 라면  -3 -2 -1 0 1 2 3 4 5
//            for(int nm=a;nm<=b;nm++){
//                val +=nm;
//            }
//            answer = val;
//        }
        if(a==b){
            answer =(long)a;
        }else{
            int start = a < b ? a : b;
            int end = a < b ? b : a;
            long hap = 0;
            for(int i=start;i<=end; i++){
                hap += i;
            }
            answer = hap;
        }
        return answer;
    }
    public static void main(String[] args) {
        AddNum btn = new AddNum();

        int a = 3;
        int b = 5;
        System.out.println( btn.solution(a, b));
        btn.solution(a, b);

    }
}
