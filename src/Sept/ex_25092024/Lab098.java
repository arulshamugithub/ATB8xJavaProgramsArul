package Sept.ex_25092024;

public class Lab098 {
    public static void main(String[] args) {
        //don't use float, long and byte coz increment or decrement is confusing
        for (float f = 0.0f; f < 10.67; f++){
            System.out.println("Hi Float -> " +f);
        }

        for (byte f = 0; f < 10.67; f++){
            System.out.println("Hi byte -> " +f);
        }

        for (long i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }
}
