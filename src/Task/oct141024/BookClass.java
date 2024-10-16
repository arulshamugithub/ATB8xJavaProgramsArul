package Task.oct141024;

abstract class BookClass {
    protected String name;
    protected String author;
    protected double price;

    public BookClass(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    abstract void getDetails();

}
