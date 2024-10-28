package flower.store.payment;

import java.util.List;
import flower.store.flowers.Item;

public interface Payment {
    double pay(List<Item> items);
    boolean isPaid();
}
