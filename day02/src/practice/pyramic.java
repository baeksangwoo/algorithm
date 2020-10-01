package practice;

import java.util.Arrays;

public class pyramic {

    public int[] solution(int[][] blocks){

        int [] answer = {};
        int Arraycount = 0;
        for(int y=1;y<=blocks.length;y++){
            Arraycount +=y;
        }
        int [] temp = new int[Arraycount]; //초기화 0으로
        int pyramidXAdd=0;
        for(int i = 0;i<blocks.length;i++){  //5층짜리 피라드미드이면 5번의 반복이 필요하다.
            pyramidXAdd+=i;
            int pyramidX = blocks[i][0];

            temp[pyramidXAdd+pyramidX] = blocks[i][1];

            for(int j=0;j<i;j++){ //2층이면 i=1 한번 더한다.
                //temp[pyramidXAdd-i] == 이게 이전 피라미드 제일 마자막 자리 수
                if(pyramidX==i){ //마지막이면 내리면서 더한다.
                    for(int p=0;p<i;p++)
                       temp[pyramidX+1]= temp[pyramidX-i]-temp[pyramidX];
                }

            }

        }
        answer =temp;
        System.out.println(Arrays.toString(answer));
        return  answer;
    }


    public static void main(String[] args) {
        pyramic bts = new pyramic();

        int [][] blocks= {{0,50},{0,22},{2,10},{1,4},{4,13}
        };
        bts.solution(blocks);
    }

}
