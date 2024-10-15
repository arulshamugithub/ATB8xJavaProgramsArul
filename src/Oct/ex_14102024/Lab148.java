package Oct.ex_14102024;

public class Lab148 {
    public static void main(String[] args) {
        xyz x= new xyz();
        x.display();
    }
}
class xyz{
    void display(){
        new abc().f4();
    }
}

class abc implements I1,I2{

    @Override
    public void f1() {
        System.out.println("f1");
    }

    @Override
    public void f2() {
        System.out.println("f2");
    }

    @Override
    public void f3() {
        System.out.println("f3");
    }

    @Override
    public void f4() {
        System.out.println("f4");
    }
}
interface I1{
    void f1();
    void f2();
}
interface I2{
    void f3();
    void f4();
}