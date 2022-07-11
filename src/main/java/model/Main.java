package model;

public class Main {
    int balance;


    public static void main(String[] args) {
        VendingMachineImpl a = new VendingMachineImpl();
        a.addCurrency(1000);
        System.out.println(a.getBalance());
    }

}
