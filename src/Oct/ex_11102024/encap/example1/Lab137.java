package Oct.ex_11102024.encap.example1;

public class Lab137 {
    public static void main(String[] args) {
        ICICIBank ac= new ICICIBank("Arul" ,10000);
        boolean is_admin = false;
        System.out.println(ac.getAcname(is_admin));
        ac.setBal(30000, is_admin);
        System.out.println(ac.getBal());
    }
}
