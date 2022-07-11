package model;

public abstract class Product {
    int id;
    double price;
    String productName;

    public int getId(){
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public abstract String examine();

    public abstract String use();
}