package Task.sep180924;

public class task004 {
    public static void main(String[] args) {
        int a = 100;
        float b = a;
        float c = (float)a;
        System.out.println(b);
        System.out.println(c);

        //narrowing
        int a1 = 500;
        //byte b1 = a1; - implicit narrowing
        byte b1 = (byte) a1;
        System.out.println(b1);

    }
}
