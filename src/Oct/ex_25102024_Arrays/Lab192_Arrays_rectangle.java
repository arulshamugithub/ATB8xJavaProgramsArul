package Oct.ex_25102024_Arrays;

import java.util.Scanner;

public class Lab192_Arrays_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
