package Oct.ex_11102024.encap.accessmodifiers.police;

public class cop {
    protected int gun;
    protected String id_Card;

    public cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("I can shoot");
    }
}
