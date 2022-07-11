package model;

public class Apple extends Product{
    public Apple(String productName, double price) {
        super.setProductName(productName);
        super.setPrice(price);
        super.id = 3;
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
        return "You eat the " + this.getProductName() + "";
    }
}
