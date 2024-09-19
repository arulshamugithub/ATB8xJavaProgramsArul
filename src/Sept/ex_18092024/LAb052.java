package Sept.ex_18092024;

public class LAb052 {
    public static void main(String[] args) {
        //GST = 18.45
        int course = 100;
        float GST = 18.45f;
        //int total = course+GST; invalid - narrowing
        float totalp = course+GST; // widening
        int total = course+(int)GST; //valid explicit narrowing - loss
        System.out.println(totalp);
        System.out.println(total);
    }
}
