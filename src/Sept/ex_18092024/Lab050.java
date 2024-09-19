package Sept.ex_18092024;

public class Lab050 {
    public static void main(String[] args) {
        //type casting
        //widening - implicit, explicit - lossless
        //narrowing - implicit, explicit - loss

        //widening
        byte b = 10;
        int a = b; // valid - implicit casting - JVM
        int a1 = (int)b; // valid - explicit casting

        //narrowing
        int val = 300;
        //byte b1 = val; //invalid implicit casting- JVM cant do this casting
        byte b2 = (byte)val; // valid explicit casting - loss of data
        System.out.println(b2);


    }
}
