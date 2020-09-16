package day02;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("홍길동",25);
        hashMap.put("장길산",42);
        hashMap.put("은비",15);
        hashMap.put("홍쇼다",13);

        System.out.println(hashMap);
        System.out.println(hashMap.keySet());

    }
}
