package Task.oct141024;

public class PrintMyBook extends BookClass{

    public PrintMyBook(String name, double price, String author) {
      super(name, price, author);

    }

    @Override
    void getDetails() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }
}
