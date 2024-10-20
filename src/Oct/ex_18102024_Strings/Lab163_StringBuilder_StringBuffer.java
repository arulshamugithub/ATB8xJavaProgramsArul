package Oct.ex_18102024_Strings;

public class Lab163_StringBuilder_StringBuffer {
    public static void main(String[] args) {
//        String name = "Arul";
//        name = "Aruljk";
        StringBuffer stringbuffer = new StringBuffer("Arul");
        stringbuffer.append("JK");
        stringbuffer.append("Kumaar");
//        System.out.println(stringbuffer);

        StringBuilder sb = new StringBuilder("Arun");
        sb.append("Mani");
        System.out.println(sb);

        //insert
        sb.insert(5,"S");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
