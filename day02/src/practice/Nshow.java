package practice;

public class Nshow {

    public int solution(int N, int number) {
        int answer = 0;

        int temp = number;
        int Ncount=0;
        int RestNcount=0;
        while(temp == number){
            if(temp+N<=number){
                temp =+N;
                Ncount++;
            }
            else{
                temp +=1;
                RestNcount++;
            }
        }
        //그러면 temp Ncount한게 2의 배수이면 합친다
        //

        return answer;
    }

    public static void main(String[] args) {
        Nshow bts = new Nshow();
        int n = 19;
        int number =34;
        bts.solution(n, number);
    }
}
