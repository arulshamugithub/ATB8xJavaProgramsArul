package Oct.ex_14102024.realex2;

public class Lab149 {

}
    interface I3{
        default void start(){ // default method can be complete in interface
            System.out.println("default method can be complete in interface");
        }
        void stop();

        static void car(){// static method can be complete in interface
            System.out.println("static method can be complete in interface");
        }
    }
abstract class aa{
    void ff(){
        System.out.println("Concrete method");
    }

     abstract void fg();

    static void gh(){
        System.out.println("static method is possible inside abstract class");
    }
}
