package Task.oct181024;

import java.sql.SQLOutput;

public class Reverse_Poly {
    public static void main(String[] args) {
        String str = "madam";
        String rev ="";
        int i = 0;
        for(i = str.length()-1; i>=0; i-- )
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)) {
            System.out.println("Poly");
        }else{
            System.out.println("not a Poly");

        }
    }
}
