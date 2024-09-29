package Task.sep270924;

import java.util.Scanner;

public class firstfiveevennos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();
        String enos = "";
        int counter = 0;
        do {
             counter = counter +1;
             if(i%2 == 0)
                 enos = enos + i + " ";
                 i++;
        }while (counter <= 9);
            System.out.println("the first 5 even nos are " + enos);
    }
}
