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
        int priceOne = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantityOne = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int priceTwo = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantityTwo = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flowerOne = new Flower();
        Flower flowerTwo = new Flower();
        flowerOne.setPrice(priceOne);
        flowerTwo.setPrice(priceOne);
        flowerTwo.setType(FlowerType.ROSE);
        FlowerPack flowerPack1 = new FlowerPack(flowerOne, quantityOne);
        FlowerPack flowerPack2 = new FlowerPack(flowerTwo, quantityTwo);
        flowerBucket.add(flowerPack1);
        flowerBucket.add(flowerPack2);
        Assertions.assertEquals(priceOne * quantityOne + priceTwo * quantityTwo, flowerBucket.getPrice());
    }
}
