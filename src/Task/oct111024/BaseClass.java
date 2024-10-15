package Task.oct111024;

public class BaseClass {
    private String name;
    private int id;

    BaseClass()
    {
        System.out.println("DC - Base Class");
    }

    BaseClass(String a){
        System.out.println("PC - Baseclass");
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean is_admin) {
        if(is_admin) {
            this.name = name;
            System.out.println("Set Name successfully done");
        } else{
            System.out.println("Not allowed, You are not a Admin");
        }
    }
    void performGet(){
        System.out.println("Get function successful");
    }
    void performGet(String var_name) {
        System.out.println("Get function successful" + var_name);
    }
    void performPost(){
        System.out.println("post function successful");
    }

    void performPatch(){
        System.out.println("patch function successful");
    }
}
