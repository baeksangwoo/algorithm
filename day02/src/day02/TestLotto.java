package day02;
import java.util.*;
public class TestLotto {

    public static void main(String[] args) {
        //ArrayList를 사용하고 Collections.sort를 활용해서 sort를 함
        //TreeSet
//        for(int i=0;i<5;i++) {
//
//            HashSet lotto = new HashSet();
//
//            TreeSet lottos = new TreeSet();
//
//            Random r = new Random();
//
//            while(lotto.size() != 6) {
//                int x = r.nextInt(45)+1;
//                lotto.add(x);
//                lottos.add(x);
//
//            }
//            System.out.println("이건 트리셋입니");
//            System.out.println(lottos);
//
//            int sum=0;
//            ArrayList numbers = new ArrayList();
//
//            Iterator<Integer> iter = lotto.iterator();
//            while(iter.hasNext()) {
//                int x = iter.next();
//
//                numbers.add(x);
//                sum+=x;
//            }
//
//            Collections.sort(numbers);
//
//            if(sum>=100 && sum<=170) {
//                System.out.println(numbers);
//            }
//            System.out.println();
//        }
        int cnt= 0;
        while(cnt < 5){
            TreeSet<Integer> lotto = new TreeSet<>();
            Random r = new Random();
            //로또 6개를 만들자!!

            while (lotto.size() < 6) {
                int x = r.nextInt(45) + 1; // (0~ 44 ) + 1 -==> 1~45
                lotto.add(x);
                //중복이 안된다. TreeSet을 쓰면 정렬이된다.
            }
            int hap = 0;
            for(Integer integer : lotto){
                hap +=integer;
            }
            if(hap >= 100 &&  hap<=170){
                System.out.println(lotto);
            }
            System.out.println("hap=" + hap);
            cnt++;
        }// while 문장

    }
}
