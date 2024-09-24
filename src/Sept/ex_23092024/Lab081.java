package Sept.ex_23092024;

public class Lab081 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001, 002, 003:
            System.out.println("Electronic items");
            break;
            case 004, 006, 005:
            System.out.println("Mechanic items");
            break;
            default:
                System.out.println("wrong item");
        }
    }
}
