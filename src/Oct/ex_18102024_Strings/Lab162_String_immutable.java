package Oct.ex_18102024_Strings;

public class Lab162_String_immutable {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat("World");
        String str3 = "Hello";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
