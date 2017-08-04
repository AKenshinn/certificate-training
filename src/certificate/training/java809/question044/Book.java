package certificate.training.java809.question044;

import java.util.Comparator;

public class Book implements Comparator<Book> {

    String name;
    double price;

    public Book() {
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compare(Book b1, Book b2) {
        return b1.name.compareTo(b2.name);
    }

    @Override
    public String toString() {
        return name + ":" + price;
    }

}
