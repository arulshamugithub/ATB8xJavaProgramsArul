package Oct.ex09102024_poly.methodoverloading;

public class Lab133 {
    public static void main(String[] args) {
        MathOperations ma = new MathOperations();
        int result = ma.add(23,34);
        String res = ma.add("Arul", "JK");
        System.out.println(result);
        System.out.println(res);
    }
}
