package practice;

public class daySunny {

    public int solution(int[][] atmos) {
        int answer = -1;

        //문제 미세먼지 x 초미세먼지 y
        //미세먼지 81이상 초미세먼지 36 이상 일때 마스크를 낀다.
        //둘가 81 && 36 일때 마스크를 낀다.
        int mask=0;
        int dayBreak=3;
        for(int i=0;i<atmos.length;i++){

            if(atmos[i][0]>80 && atmos[i][1]>36){
                //마스크 하루끼고 버리기
                //마스크를 끼고 있었으면 사용하던 마스크는 그날 버린다.
                if(dayBreak==3){
                    mask++;
                    dayBreak=3; //다시 초기화 마스크 끼는 날
                }else{
                    dayBreak=3;
                }
            }
            else if(atmos[i][0]>80 || atmos[i][1]>36){
                //미세먼지 초미세먼지가 하나라도 올라갔을때 마스크를 껴야한다.
                //그런데 마스크를 끼고 있었는가는 중요한 문제다
                if(dayBreak>1){
                    dayBreak--;
                }else{
                    dayBreak=3;
                    mask++;
                }
            }else{
                if(dayBreak!=3 && dayBreak!=0)
                dayBreak--;
                else if(dayBreak==3 || dayBreak==0){
                    dayBreak=3;
                }
            }

        }

        return mask;
    }

    public static void main(String[] args) {
            daySunny bts = new daySunny();
            int [][] atmos = {{80, 35}, {70, 38}, {100, 41}, {75,30}, {160,80}, {77, 29}, {181, 68}, {151, 76}};

       int [][]atmos2= {{140, 90}, {177, 75}, {95, 45}, {71, 31}, {150, 30},{80, 35}, {72, 33}, {166, 81}, {151, 75}};
        System.out.println(bts.solution(atmos));
    }
}
