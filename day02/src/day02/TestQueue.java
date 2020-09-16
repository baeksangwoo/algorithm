package day02;

import java.util.*;
public class TestQueue {
    public static void main(String[] args) {
      Queue<String> que = new PriorityQueue<String>();
     // PriorityQueue 구현체 First in First Out
        que.add("이름 1");
        que.add("이름 2");
        que.add("이름 3");

        System.out.println(que);

        while (!que.isEmpty()){
            String str = que.poll();
            System.out.println(str);
        }
        //컴퓨터 cpu가 속도가 제일 빠르다 Ram 제일 느린것이 하드디스크
        //hDD에서 ram으로 넘어가는 것이 버퍼 ram에서 cpu로 넘어가는 것이 cash

    }
}
