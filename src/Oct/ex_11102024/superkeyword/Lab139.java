package Oct.ex_11102024.superkeyword;

public class Lab139 {
    public static void main(String[] args) {
    car c = new car();
    c.display();
    }
}
class vehicle{
    public int maxspeed = 180;

    vehicle()
    {
        System.out.println("DC Vehicle");
    }
    vehicle(int a) {
        System.out.println("PC Vehicle");
    }

    void message(){
        System.out.println("Hello vehicle");
    }

    void message(int a){
        System.out.println("Hello Vehicle");
    }
    void display(){
        System.out.println("Parent");
    }
}

class car extends vehicle{
    private int maxspeed = 269;

    car()
    {
        super(10);
        System.out.println("DC Car");
        System.out.println(this.maxspeed);
        System.out.println(super.maxspeed);
        this.display();
        super.display();
    }
    void display()
    {
        System.out.println("Child");
    }

}



