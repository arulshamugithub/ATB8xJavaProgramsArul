package Sept.ex_23092024;

public class Lab082 {
    public static void main(String[] args) {
        int itemcode = 8; //from >JDK 13
        switch (itemcode){
            case 1 -> System.out.println("Its a laptop");//multiple action not allowed
            case 2, 3 -> System.out.println("Its a PC");
            default -> System.out.println("Wrong code");
        }
    }
}
