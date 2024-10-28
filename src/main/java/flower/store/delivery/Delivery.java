package flower.store.delivery;

import flower.store.flowers.Item;
import java.util.List;

public interface Delivery {
    double deliver(List<Item> items);
    boolean isDelivered();
}
