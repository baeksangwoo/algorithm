package practice;

import java.util.*;
public class PrimeNuberSum {

    public int solution(int n) {
        int answer = 0;

        for(int i=1;i<=n/2;i++){
            if(n%i==0) {
                answer+=i;
            }
        }

        return answer+n;
    }

    public static void main(String[] args) {
        PrimeNuberSum bts = new PrimeNuberSum();
        int n = 12;
        System.out.println(bts.solution(n));
    }
}
