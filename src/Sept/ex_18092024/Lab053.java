package Sept.ex_18092024;

public class Lab053 {
    public static void main(String[] args) {
        // increment (++) / decrement (--)
        // pre increment ++operand - value incremented first and then stored in the result
        int a = 10;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        int c = 20;
        System.out.println(++c);
        System.out.println(c);

        //post increment
        //operation first and then increase
        int d = 30;
        System.out.println(d++);
        System.out.println(d);
    }
}
