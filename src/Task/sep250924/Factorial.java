package Task.sep250924;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();
        int res = 1;
        for (int j = i; j >=1; j--) {
            res = res * j;
        }
        System.out.println("Factorial of " + i +" is :" +res);
    }
}
