package Assignment_02;

public class Book implements Media {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
