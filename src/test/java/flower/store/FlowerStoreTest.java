package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class FlowerStoreTest {
    FlowerStore theStore;
    Flower roseOne;
    Flower roseTwo;
    Flower roseThree;
    Flower tulip;

    @BeforeEach
    public void init() {
        theStore = new FlowerStore();
        roseOne = new Flower();
        roseOne.setColor(FlowerColor.RED);
        roseOne.setSepalLength(5);
        roseOne.setType(FlowerType.ROSE);

        roseTwo = new Flower();
        roseTwo.setColor(FlowerColor.WHITE);
        roseTwo.setSepalLength(5);
        roseTwo.setType(FlowerType.ROSE);

        roseThree = new Flower();
        roseThree.setColor(FlowerColor.YELLOW);
        roseThree.setSepalLength(9);
        roseThree.setType(FlowerType.ROSE);

        tulip = new Flower();
        tulip.setColor(FlowerColor.RED);
        tulip.setSepalLength(5);
        tulip.setType(FlowerType.TULIP);

        theStore.add(tulip);
        theStore.add(roseOne);
        theStore.add(roseTwo);
        theStore.add(roseThree);
    }

    @Test
    public void testSearch() {
        Flower toSearchOne = new Flower();
        toSearchOne.setColor(FlowerColor.RED);
        List<Flower> expectedLstOne = new ArrayList<Flower>();
        expectedLstOne.add(tulip);
        expectedLstOne.add(roseOne);
        Assertions.assertEquals(expectedLstOne, theStore.search(toSearchOne));

        Flower toSearchTwo = new Flower();
        toSearchTwo.setColor(FlowerColor.RED);
        toSearchTwo.setType(FlowerType.ROSE);
        List<Flower> expectedLstTwo = new ArrayList<Flower>();
        expectedLstTwo.add(roseOne);
        Assertions.assertEquals(expectedLstTwo, theStore.search(toSearchTwo));

        Flower toSearchThree = new Flower();
        toSearchThree.setColor(FlowerColor.YELLOW);
        toSearchThree.setType(FlowerType.ROSE);
        toSearchThree.setSepalLength(3);
        List<Flower> expectedLstThree = new ArrayList<Flower>();
        Assertions.assertEquals(expectedLstThree, theStore.search(toSearchThree));


        Flower toSearchFour = new Flower();
        toSearchFour.setType(FlowerType.ROSE);
        List<Flower> expectedLstFour = new ArrayList<Flower>();
        expectedLstFour.add(roseOne);
        expectedLstFour.add(roseTwo);
        expectedLstFour.add(roseThree);
        Assertions.assertEquals(expectedLstFour, theStore.search(toSearchFour));
    }
}
