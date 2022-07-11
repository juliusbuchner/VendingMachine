package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class VendingMachineImplTest {
    VendingMachineImpl machine = new VendingMachineImpl();


    @Test
    void getBalance() {
        machine.addCurrency(10);
        int getBalance = machine.getBalance();
        Assertions.assertEquals(10, getBalance);
    }

    @Test
    void request() {
        machine.addCurrency(50);
        machine.addProduct();
        machine.request(1);
        Assertions.assertEquals("Chocolate", machine.purchasedItems.get(0).productName);
    }

    @Test
    void endSession() {
        int endSession = machine.getBalance();
        Assertions.assertEquals(0, endSession);
    }
//
    @Test
    void getDescription() {
        Chocolate c = new Chocolate("Chocolate", 20);
        String getDescription = c.toString();
        Assertions.assertEquals("Chocolate: id is 1, price is 20.0", getDescription);
    };

    @Test
   void getProducts() {
        machine.addCurrency(50);
        machine.addProduct();
        machine.request(1);
        Chocolate c = new Chocolate("Chocolate",20);
        List<String> productList = machine.getProducts();

        Assertions.assertEquals(productList.get(0), machine.purchasedItems.get(0).toString());
   }
}