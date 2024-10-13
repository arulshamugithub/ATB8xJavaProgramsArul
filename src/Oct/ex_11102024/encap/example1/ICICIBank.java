package Oct.ex_11102024.encap.example1;

public class ICICIBank {
    String acname;
    long bal;

    public ICICIBank(String acname, long bal) {
        this.acname = acname;
        this.bal = bal;
    }

    public String getAcname(boolean is_admin) {
        if (is_admin) {
            return acname;
        } else {
            return null;
        }
    }
    public void setAcname(String acname) {
        this.acname = acname;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean is_admin) {
        if (is_admin) {
            this.bal = bal;
        }else{
            System.out.println("Not allowed to set balance");
        }
    }
}
