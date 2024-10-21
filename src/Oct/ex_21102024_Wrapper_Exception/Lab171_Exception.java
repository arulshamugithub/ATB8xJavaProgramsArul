package Oct.ex_21102024_Wrapper_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab171_Exception {
    public static void main(String[] args) {
        //Checked exception
        //FileInputStream file = new FileInputStream("C://a.txt");
        //JVM knows this file may or may not exist

        //Unchecked Exception - Arithmetic exception
        int a = 10;
        int c = a/0;
        System.out.println(c);
    }
}
