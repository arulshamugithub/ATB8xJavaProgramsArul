package Oct.ex_18102024_Strings;

import java.util.Locale;

public class Lab161_String_Functions {
    public static void main(String[] args) {
    String str = "Hello World";
        System.out.println(str.length());
        System.out.println("Sub String " + str.substring(0, 1));
        //trim
        System.out.println("Trim '" +str.trim() +"'");
        //convert uppercase and lowercase
        System.out.println("uppercase: " +str.toUpperCase());
        System.out.println("lowercase: " +str.toLowerCase());
        System.out.println(str.charAt(2));
        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf('H'));
        System.out.println(str.contains("p"));
        System.out.println(str.isEmpty());
    }
}
