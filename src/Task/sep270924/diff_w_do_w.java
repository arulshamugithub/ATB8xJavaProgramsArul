package Task.sep270924;

import java.util.Scanner;

public class diff_w_do_w {
    public static void main(String[] args) {
//        //add sum of nos from 1 to 100
//
//        int s = 0;
//        int i = 1;
//        while (i <= 100){
//            s = s + i;
//            i++;
//        }
//        System.out.println("Sum of nos from 1 to 100 : " +s);
        Scanner sc = new Scanner(System.in);
        String uid, pwd;
        int i = 0;
        do{
            if(i==3)
            break;
            System.out.println("Enter the username");
            uid = sc.next();
            System.out.println("Enter the password");
            pwd = sc.next();
            i++;
        }while(!uid.equals("java") || !pwd.equals("program"));

    }

}
