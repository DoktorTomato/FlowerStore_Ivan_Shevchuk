package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {
    List<Flower> inv;

    public FlowerStore() {
        inv = new ArrayList<Flower>();
    }

    public void add(Flower newFlower) {
        inv.add(newFlower);
    }

    public List<Flower> search(Flower searchedFlower) {
        List<Flower> perfectFit = new ArrayList<Flower>();
        for (Flower f:inv) {
            if (f == null) {
                continue;
            }

            if (searchedFlower.getColor() == null) {
                ;
            } else if (f.getColor() != searchedFlower.getColor()) {
                continue;
            }

            if (searchedFlower.getType() == null) {
                ;
            } else if (f.getType() != searchedFlower.getType()) {
                continue;
            }
            if (searchedFlower.getSepalLength() == 0) {
                ;
            } else if (f.getSepalLength() != searchedFlower.getPrice()) {
                continue;
            }
            perfectFit.add(f);
        }
        return perfectFit;
    }
}
