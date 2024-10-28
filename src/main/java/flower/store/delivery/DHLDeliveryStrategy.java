package flower.store.delivery;

import java.util.List;

import flower.store.flowers.Item;

public class DHLDeliveryStrategy implements Delivery{
    private String name;
    private String adress;
    private boolean delivered = false;

    public DHLDeliveryStrategy(String adres) {
        name = "DHL";
        adress = adres;
    }

    @Override
    public boolean isDelivered() {
        return delivered;
    }

    @Override
    public double deliver(List<Item> item) {
        System.out.println("Delivered with DHL to " + adress);
        delivered = true;
        return 0;
    }
    
}
