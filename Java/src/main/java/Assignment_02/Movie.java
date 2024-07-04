package Assignment_02;

public class Movie implements Media {
    private double price;

    public Movie(double price) {
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
