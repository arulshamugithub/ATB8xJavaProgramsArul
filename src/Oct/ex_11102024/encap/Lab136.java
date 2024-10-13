package Oct.ex_11102024.encap;

public class Lab136 {
    public static void main(String[] args) {
        VWOLogin vmlogin = new VWOLogin("badadmin", "password123");
        System.out.println(vmlogin.password);
        vmlogin.password = "password321";
        System.out.println(vmlogin.password);

        GoodVMOLogin gvmlogin = new GoodVMOLogin("GoodAdmin", "Password432");
        //System.out.println(gvmlogin.password); we cant access
        //gvmlogin.password = "any";
        System.out.println(gvmlogin.getUsername());

        boolean isAdmin = false;

        gvmlogin.setPassword("newpassword", isAdmin);
        System.out.println(gvmlogin.getPassword());
    }
}
