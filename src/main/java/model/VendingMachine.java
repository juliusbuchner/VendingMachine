package model;

import java.util.ArrayList;

public interface VendingMachine {
    void addCurrency(int amount);
    int getBalance();
    Product request(int id);
    int endSession();
    String getDescription(int id);
    ArrayList<String> getProducts();
}