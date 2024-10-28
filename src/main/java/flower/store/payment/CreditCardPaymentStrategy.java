package flower.store.payment;

import java.util.List;

import flower.store.flowers.Item;

public class CreditCardPaymentStrategy implements Payment {
    private String name;
    private String description;
    private boolean paid = false;

    public CreditCardPaymentStrategy() {
        name = "Credit card";
        description = "Credit card payment";
    }

    @Override
    public boolean isPaid() {
        return paid;
    }

    @Override
    public double pay(List<Item> items) {
        double price = 0;
        for (Item item: items) {
            price += item.getPrice();
        }
        System.out.println("Paid " + price + " with credit card");
        paid = true;
        return price;
    }
    
}
