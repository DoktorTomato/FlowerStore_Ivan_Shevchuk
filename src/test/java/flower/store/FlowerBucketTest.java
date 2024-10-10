package flower.store;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price1 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity1 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int price2 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity2 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        flower1.setPrice(price1);
        flower2.setPrice(price2);
        flower2.setType(FlowerType.ROSE);
        FlowerPack flowerPack1 = new FlowerPack(flower1, quantity1);
        FlowerPack flowerPack2 = new FlowerPack(flower2, quantity2);
        flowerBucket.add(flowerPack1);
        flowerBucket.add(flowerPack2);
        Assertions.assertEquals(price1 * quantity1 + price2 * quantity2, flowerBucket.getPrice());
    }
}
