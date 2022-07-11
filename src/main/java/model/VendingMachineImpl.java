package model;

import java.util.ArrayList;

public class VendingMachineImpl implements VendingMachine{
    int[] moneyDeposition = new int[]{1,2,5,10,20,50,100,200,500,1000};
    int depositPool;

//    @Override
//    public void addCurrency(int amount) {
//        boolean currencyRest = false;
//
//        for (int deposit : moneyDeposition) {
//            if (amount == deposit) {
//                balance += amount;
//                currencyRest = true;
//            }
//        }
//
//        if (!currencyRest) {
//            System.out.println("This amount is not a correct format ");
//        }
//    }

    @Override
    public void addCurrency(int amount) {
        boolean currencyRest = false;

        for (int deposit : moneyDeposition) {
            if (amount == deposit) {
                depositPool += amount;
                currencyRest = true;
            }
        }

        if (!currencyRest) {
            System.out.println("This amount is not a correct format ");
        }
    }

    @Override
    public int getBalance() {
        return this.depositPool;
    }

    @Override
    public Product request(int id) {
        
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int id) {
        return null;
    }

    @Override
    public ArrayList<String> getProducts() {
        return null;
    }
}
