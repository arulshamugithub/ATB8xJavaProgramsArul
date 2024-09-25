package Task.sep250924;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prime_numbers {
    public static void main(String[] args) {
        int num = 0;
        int i = 0;
        String primeNumbers = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for (i = 1; i <=n ; i++)
         {
           int counter = 0;
           for (num = i; num>=1; num--)
           {
               if(i%num == 0)
               {
                   counter = counter +1;
               }

           }
           if(counter == 2)
           {
               primeNumbers = primeNumbers + i + " ";
           }
        }
        System.out.println("Prime number from 1 to " + n + " are");
        System.out.println(primeNumbers);
    }
}
