package Task.sep200924;

public class task001 {
    public static void main(String[] args) {
        int a = 23;
        int b = 20;
        int c = 30;
        int max = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("maximum is : " + max);

    }
}
