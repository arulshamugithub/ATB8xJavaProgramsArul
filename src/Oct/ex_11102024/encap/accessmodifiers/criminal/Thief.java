package Oct.ex_11102024.encap.accessmodifiers.criminal;

import Oct.ex_11102024.encap.accessmodifiers.police.cop;

public class Thief {
    public static void main(String[] args) {
        cop c = new cop(10);
        //System.out.println(c.gun); coz cop class variables are protected
        //c.canIShoot(); coz this method is protected in cop class
    }
}
