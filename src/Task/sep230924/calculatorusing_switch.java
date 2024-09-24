package Task.sep230924;

import java.util.Scanner;

public class calculatorusing_switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fisrt number");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation you want perform");
        String ch = sc.next();
        switch (ch){
            case "+":
                System.out.println("Addition of 2 nos " +(num1+num2));
                break;
            case "-" :
                System.out.println("Subtraction of 2 nos " +(num1-num2));
                break;
            case "/" :
                System.out.println("Division of 2 nos " +(num1/num2));
                break;
            case "*" :
                System.out.println("Multiplication of 2 nos " +(num1*num2));
                break;
            case "%" :
                System.out.println("remainder of 2 nos 4" +(num1%num2));
                break;
            default:
                System.out.println("invalid operation");
        }
    }
}
