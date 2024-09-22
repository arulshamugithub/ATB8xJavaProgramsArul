package Task.sep200924;

public class task001 {
    public static void main(String[] args) {
        int a = 340;
        int b = 20;
        int c = 30;

        int max1 = a > b ? a : b;
        int max2 =  max1 > c ? max1 : c;
        System.out.println("maximum is : " + max2);

    }
}
