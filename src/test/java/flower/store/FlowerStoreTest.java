package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class FlowerStoreTest {
    FlowerStore theStore;
    Flower rose1;
    Flower rose2;
    Flower rose3;
    Flower tulip;

    @BeforeEach
    public void init() {
        theStore = new FlowerStore();
        rose1 = new Flower();
        rose1.setColor(FlowerColor.RED);
        rose1.setSepalLength(5);
        rose1.setType(FlowerType.ROSE);

        rose2 = new Flower();
        rose2.setColor(FlowerColor.WHITE);
        rose2.setSepalLength(5);
        rose2.setType(FlowerType.ROSE);

        rose3 = new Flower();
        rose3.setColor(FlowerColor.YELLOW);
        rose3.setSepalLength(9);
        rose3.setType(FlowerType.ROSE);

        tulip = new Flower();
        tulip.setColor(FlowerColor.RED);
        tulip.setSepalLength(5);
        tulip.setType(FlowerType.TULIP);

        theStore.add(tulip);
        theStore.add(rose1);
        theStore.add(rose2);
        theStore.add(rose3);
    }

    @Test
    public void testSearch() {
        Flower toSearch1 = new Flower();
        toSearch1.setColor(FlowerColor.RED);
        List<Flower> expectedLst1 = new ArrayList<Flower>();
        expectedLst1.add(tulip);
        expectedLst1.add(rose1);
        Assertions.assertEquals(expectedLst1, theStore.search(toSearch1));

        Flower toSearch2 = new Flower();
        toSearch2.setColor(FlowerColor.RED);
        toSearch2.setType(FlowerType.ROSE);
        List<Flower> expectedLst2 = new ArrayList<Flower>();
        expectedLst2.add(rose1);
        Assertions.assertEquals(expectedLst2, theStore.search(toSearch2));

        Flower toSearch3 = new Flower();
        toSearch3.setColor(FlowerColor.YELLOW);
        toSearch3.setType(FlowerType.ROSE);
        toSearch3.setSepalLength(3);
        List<Flower> expectedLst3 = new ArrayList<Flower>();
        Assertions.assertEquals(expectedLst3, theStore.search(toSearch3));


        Flower toSearch4 = new Flower();
        toSearch4.setType(FlowerType.ROSE);
        List<Flower> expectedLst4 = new ArrayList<Flower>();
        expectedLst4.add(rose1);
        expectedLst4.add(rose2);
        expectedLst4.add(rose3);
        Assertions.assertEquals(expectedLst4, theStore.search(toSearch4));
    }
}
