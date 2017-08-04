package certificate.training.java809.question011;

public class Product {

    int id;
    int price;

    public Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ":" + price;
    }
    
}
