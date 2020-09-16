package day02;
import java.util.*;
public class TestStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.add("이름 1");
        stack.add("이름 2");
        stack.add("이름 3");
        System.out.println(stack);

        while(!stack.isEmpty()){
            String name = stack.pop();
            System.out.println(name);
        }
    }
}
