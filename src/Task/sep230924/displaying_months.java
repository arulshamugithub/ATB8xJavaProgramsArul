package Task.sep230924;

import java.util.Scanner;

public class displaying_months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int no = sc.nextInt();
        switch (no) {
            case 1:
                System.out.println("Month is January");
                break;
            case 2:
                System.out.println("Month is February");
                break;
            case 3:
                System.out.println("Month is March");
                break;
            case 4:
                System.out.println("Month is April");
                break;
            case 5:
                System.out.println("Month is May");
                break;
            case 6:
                System.out.println("Month is June");
                break;
            case 7:
                System.out.println("Month is July");
                break;
            case 8:
                System.out.println("Month is August");
                break;
            case 9:
                System.out.println("Month is September");
                break;
            case 10:
                System.out.println("Month is October");
                break;
            case 11:
                System.out.println("Month is November");
                break;
            case 12:
                System.out.println("Month is December");
                break;
            default:
                System.out.println("No month related to entered no");
                break;
        }
    }
}
