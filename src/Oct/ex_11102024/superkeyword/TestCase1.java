package Oct.ex_11102024.superkeyword;

public class TestCase1 extends BaseClass{

    TestCase1(){
        super();
        //System.out.println("DC - Child");
        this.setBrowser("Edge", true);
    }

    @Override
    public void setBrowser(String browser, boolean is_auth) {
        super.setBrowser(browser, is_auth);
    }
}
