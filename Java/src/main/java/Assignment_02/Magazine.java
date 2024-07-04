package Assignment_02;

public class Magazine implements Media {
    private double price;

    public Magazine(double price) {
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
