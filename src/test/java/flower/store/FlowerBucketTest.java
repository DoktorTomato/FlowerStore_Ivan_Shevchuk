package flower.store;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import flower.store.flowers.Flower;
import flower.store.flowers.FlowerType;
import flower.store.flowers.FlowerBucket;
import flower.store.flowers.FlowerPack;

import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
        System.out.println("Testing...");
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
        flowerTwo.setPrice(priceTwo);
        flowerTwo.setType(FlowerType.ROSE);
        FlowerPack flowerPackOne = new FlowerPack(flowerOne, quantityOne);
        FlowerPack flowerPackTwo = new FlowerPack(flowerTwo, quantityTwo);
        flowerBucket.add(flowerPackOne);
        flowerBucket.add(flowerPackTwo);
        Assertions.assertEquals(flowerBucket.getPrice(), priceOne * quantityOne + priceTwo * quantityTwo);
    }
}
