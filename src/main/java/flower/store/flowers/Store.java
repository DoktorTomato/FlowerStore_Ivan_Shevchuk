package flower.store.flowers;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Flower> flowers;
    public Store() {
        this.flowers = new ArrayList<>();
    }
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }
    public List<Flower> search(Flower flower) {
        List<Flower> result = new ArrayList<>();
        for (Flower f: flowers) {
            if (!(f.getColor().equals(flower.getColor()))) {
                continue;
            }
            if (!(f.getType().equals(flower.getType()))) {
                continue;
            }
            if (f.getSepalLength() != flower.getSepalLength()) {
                continue;
            }
            result.add(f);
        }
        return result;
    }
}
