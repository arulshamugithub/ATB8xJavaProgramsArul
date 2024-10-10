package Oct.ex_09102024_inheritance.HasA;

public class Car {
    public void startCar()
    {
        new Engine().start();
        new Tyre().rolling();
    }
}
