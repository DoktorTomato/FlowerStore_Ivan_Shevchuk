package flower.store.delivery;

import java.util.List;

import flower.store.flowers.Item;

public class PostDeliveryStrategy implements Delivery{
    private String name;
    private String adress;
    private boolean delivered = false;

    public PostDeliveryStrategy(String adres) {
        name = "Post";
        adress = adres;
    }

    @Override
    public boolean isDelivered() {
        return delivered;
    }

    @Override
    public double deliver(List<Item> items) {
        System.out.println("Delivered with post to " + adress);
        delivered = true;
        return 0;
    }

}
