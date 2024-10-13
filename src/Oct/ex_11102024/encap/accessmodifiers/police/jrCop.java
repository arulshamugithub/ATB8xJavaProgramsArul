package Oct.ex_11102024.encap.accessmodifiers.police;

public class jrCop {
    public static void main(String[] args) {
        cop jrc= new cop(20);
        System.out.println(jrc.gun);
        jrc.canIShoot();
    }
}
