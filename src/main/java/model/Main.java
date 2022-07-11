package model;

public class Main {
    int balance;


    public static void main(String[] args) {
        VendingMachineImpl a = new VendingMachineImpl();
        a.addProduct();
        a.addCurrency(1000);
        System.out.println(a.getBalance());
        a.request(1);
        a.request(2);
        a.request(3);
        System.out.println(a.getProducts());
    }

}
