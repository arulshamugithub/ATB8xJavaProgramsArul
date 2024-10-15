package Oct.ex_14102024.realex2;

public class HondaCity extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Car");
    }
}
