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
        for (Product product : productList) {
            if (product.id == id && depositPool > product.getPrice())
            {
                depositPool -= product.getPrice();
                purchasedItems.add(product);

                return product;
            }
        }

        return null;
    }

    @Override
    public int endSession() {
        depositPool = 0;
        return depositPool;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : productList) {
            return product.toString();
        }
        return null;
    }

    @Override
    public ArrayList<String> getProducts() {
        ArrayList<String> itemInfo = new ArrayList<>();
        for (Product purchasedItem : purchasedItems) {
            itemInfo.add(purchasedItem.toString());
        }
        return itemInfo;
    }
}
