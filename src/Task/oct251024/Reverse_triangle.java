package Task.oct251024;

import java.util.Scanner;

public class Reverse_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=5; i>=0; i--){
            for(int j=0; j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
