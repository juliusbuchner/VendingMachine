package model;

public class Chocolate extends Product{
    public Chocolate(String productName, double price) {
        super.setProductName(productName);
        super.setPrice(price);
        super.id = 1;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public String examine(){
        return this.getProductName() + ":\n"  + "cost is " + this.getPrice();
    }

    public String use(){
        return "You ate the " + this.getProductName() + ".";
    }
}