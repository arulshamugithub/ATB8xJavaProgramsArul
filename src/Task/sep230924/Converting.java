package Task.sep230924;

import java.util.Scanner;

public class Converting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want perform ex - kmtomile || ctof");
        String op = sc.next();
        System.out.println("Enter the value");
        int val = sc.nextInt();
        double res;
        switch (op){
            case "kmtomile" :
                res = (val * 0.621371);
                System.out.println(res+" Miles");
                break;
            case "ctof":
                res = (val * 9/5) + 32;
                System.out.println(res+"F");
                break;
            default:
                System.out.println("invalid operation code");
                break;
        }



    }
}
