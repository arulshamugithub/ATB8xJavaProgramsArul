package Oct.ex_25102024_Arrays;

public class Lab189_Arrays_String {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Arul";
        names[1] = "Arun";
        names[2] = "Anil";
        names[3] = "Anish";
        names[4] = "Akash";
        System.out.println(names.length);
        for(int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}
