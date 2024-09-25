package Sept.ex_25092024;

public class Lab108 {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            if (i%2 == 0){
                System.out.println(i + " Even");
                continue;
            }
            System.out.println(i);
        }
    }
}
