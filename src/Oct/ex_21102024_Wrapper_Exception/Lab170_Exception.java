package Oct.ex_21102024_Wrapper_Exception;

public class Lab170_Exception {
    public static void main(String[] args) {
        System.out.println("Start of the Program");
        String ip = args[0];
        String ip1 = args[1];
        String ip2 = args[2];
        String ip3 = args[3];//ArrayIndexBoundException - coz arg value not passed
        System.out.println(ip);
        System.out.println(ip1);
        System.out.println(ip2);
    }
}
