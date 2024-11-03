package Oct.ex_3010204_CollectionFrameWork2;

import java.util.Stack;

public class Lab207_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("arul");
        s.add("priya");
        s.add("joel");
        s.add("mabel");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.add("nambi"));
        System.out.println(s);
        s.add(0,"Lucky");
        System.out.println(s);
    }
}
