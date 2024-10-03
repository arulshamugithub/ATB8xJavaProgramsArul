package Sept.ex_30092024;

public class Lab122 {
    public static void main(String[] args) {
        //1. without parameters and without return type
        function_type1();
        //2. without parameters and with return type
        int age = function_type2();
        System.out.println(age);
        //3. with parameters and without return type
        function_type3("Mr", "Arul", 47);

        //4. with parameters and with return type
        int result = function_type4(14, 15);
        System.out.println(result);
    }

    //1. without parameters and with return type
    public static void function_type1() {
        System.out.println("1.Without parameters and without return type");
    }

    //2. without parameters and without return type

    public static int function_type2() {
        System.out.println("2.Without parameters and with return type");
        return 47;

    }

    //3.With parameters and without return type
    public static void function_type3(String title, String name, int age) {
        System.out.println("3.With parameters and without return type");
        System.out.println("You have shared the name " + title + " " + name + " " + age);
    }

    //4. with parameters and with return type
    public static int function_type4(int a, int b) {
        System.out.println("3.  //4. with parameters and with return type");
        return a + b;
    }

}