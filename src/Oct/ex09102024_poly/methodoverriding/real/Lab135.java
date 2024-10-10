package Oct.ex09102024_poly.methodoverriding.real;

public class Lab135 {
    public static void main(String[] args) {
        Arul ar = new Arul();
        ar.home();

        Father obj = new Father();
        obj.home();

        //dynamic dispatch
        Father fr = new Arul();
        fr.home();
    }
}
