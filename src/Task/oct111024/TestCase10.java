package Task.oct111024;

public class TestCase10 extends BaseClass{
    TestCase10(){
        super("Arul");
        System.out.println("DC - Child Class");
        this.setName("Edge",true);
    }

    @Override
    public void setName(String name, boolean is_admin) {
        super.setName(name, is_admin);
    }
}


