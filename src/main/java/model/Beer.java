package model;

public class Beer extends Product{
    public Beer(String productName, double price) {
        super.setProductName(productName);
        super.setPrice(price);
        super.id = 2;
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String examine() {
        return this.getProductName() + ":\n"  + "cost is " + this.getPrice();
    }

    @Override
    public String use() {
        return "You drink the " + this.getProductName() + ".";
    }
    @Override
    public String toString() {
        return "Beer: " +
                "id is " + id +
                ", price is " + price;
    }
}
