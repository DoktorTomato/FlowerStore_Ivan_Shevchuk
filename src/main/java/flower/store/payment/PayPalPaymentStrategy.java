package flower.store.payment;

import java.util.List;

import flower.store.flowers.Item;

public class PayPalPaymentStrategy implements Payment {
    private String name;
    private String description;
    private boolean paid = false;

    public PayPalPaymentStrategy() {
        name = "PayPal";
        description = "PayPal payment";
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
        System.out.println("Paid " + price + " with PayPal");
        paid = true;
        return price;
    }
    
}
