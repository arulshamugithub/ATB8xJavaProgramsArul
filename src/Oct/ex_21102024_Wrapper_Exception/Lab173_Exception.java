package Oct.ex_21102024_Wrapper_Exception;

public class Lab173_Exception {
    public static void main(String[] args) {

        int c = 1;
        try {
            c = 10 / c;
            String s = null;
            s.trim();
            System.out.println(c);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
            ;
        } catch (Exception e) {
            System.out.println("End of the program");
        }
    }
}