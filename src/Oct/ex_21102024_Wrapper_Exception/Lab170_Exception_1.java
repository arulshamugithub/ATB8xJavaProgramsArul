package Oct.ex_21102024_Wrapper_Exception;

import java.sql.SQLOutput;

public class Lab170_Exception_1 {
    public static void main(String[] args) {
        System.out.println("Start of the Program");
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println(b);
        System.out.println("End of Program");
    }
}
