package Oct.ex_14102024;

public class Lab147 {
    public static void main(String[] args) {
        P p = new P();
        p.f1();
    }
}

    class P implements I{

        @Override
        public void f1() {
            System.out.println("Created by P");
        }
    }
    interface I{
        void f1();
    }

