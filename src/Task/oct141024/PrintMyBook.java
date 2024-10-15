package Task.oct141024;

public class PrintMyBook extends BookClass{
    @Override
    void getDetails() {
        System.out.println("Got Details");
    }

    @Override
    void getName() {
        System.out.println("Harry Potter");
    }

    @Override
    void getAuthor() {
        System.out.println("JK Rowling");
    }

    @Override
    void getPrice() {
        System.out.println("$120");
    }
}
