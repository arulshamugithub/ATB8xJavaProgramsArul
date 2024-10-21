package Oct.ex_21102024_Wrapper_Exception;

public class Lab168 {
    public static void main(String[] args) {
        String num = "11";
        //int a = num; //non-primitive to primitive - not possible
        Integer a = Integer.valueOf(num);
        System.out.println(a);
        int a1 = a; //unboxing

        //String to primitive
        int a3 = Integer.parseInt(num);
        System.out.println(a3);
    }
}
