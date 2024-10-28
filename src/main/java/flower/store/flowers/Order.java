package flower.store.flowers;

import java.util.ArrayList;
import java.util.List;
import flower.store.payment.Payment;
import flower.store.delivery.Delivery;



public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        items = new ArrayList<>();
    }

    public Order(List<Item> items) {
        this.items = items;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void processOrder() {
        double total = calculateTotalPrice();
        payment.pay(items);
        delivery.deliver(items);
        System.out.println("Order with total price " + total + " processed");
    }
}
