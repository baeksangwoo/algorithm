import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("홍길동");
        list.add("장길산");
        list.add("임꺽정");

        System.out.println(list.size());
        System.out.println(list);

        for(String name : list){
            System.out.println(name);
        }
    }
}
