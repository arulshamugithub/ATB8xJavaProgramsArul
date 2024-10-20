package Oct.ex_18102024_Strings;

public class Lab160_String_Equals {
    public static void main(String[] args) {
        String greeting = "Hello";
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s4 = "Hello";
        String s5 = "hello";
        System.out.println(s1==s2);//diff locations and returns "false"
        System.out.println(s1==s4);//checking the string location, returns "true"
        System.out.println(s1.equals(s2)); //it checks the values
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
