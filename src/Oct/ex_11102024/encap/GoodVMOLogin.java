package Oct.ex_11102024.encap;

public class GoodVMOLogin {
    private String username;
    private String password;

    public GoodVMOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        } else {
            System.out.println("Not Allowed");
        }
    }
}
