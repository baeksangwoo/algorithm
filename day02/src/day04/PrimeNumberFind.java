package day04;

public class PrimeNumberFind {

    public int solution(int n) {
        int answer = 0;
        //에라토스테네스의 체
        boolean prime[] = new boolean[n + 1];

        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            // prime[i]가 소수라면
            if (!prime[i]) {
                // prime[j] 소수가 아닌 표시
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        // 소수 출력
        for (int i = 1; i <= n; i++) {
            if (!prime[i] && i!=0) {
                answer++;

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PrimeNumberFind bts = new PrimeNumberFind();
        int n = 10;

        System.out.println(bts.solution(n));
    }
}
