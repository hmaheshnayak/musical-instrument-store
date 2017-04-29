package main.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * Created by mahesh on 4/28/2017.
 * Class that contains unit tests for Inventory class
 */
public class InventoryTest {
    Inventory testInventory;

    @Before
    public void setUp() throws Exception {
        testInventory = new Inventory();

        testInventory.addInstrument(new Guitar("11277", 3999.95,
                new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIANROSEWOOD, Wood.SITKA)));
        testInventory.addInstrument(new Guitar("V95693", 1499.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER)));
        testInventory.addInstrument(new Guitar("V9512", 1549.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER)));
        testInventory.addInstrument(new Guitar("122784", 5495.95,
                new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6, Wood.MAHOGANY, Wood.ADIRONDACK)));
        testInventory.addInstrument(new Guitar("76531", 6295.95,
                new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6, Wood.BRAZILIANROSEWOOD, Wood.ADIRONDACK)));
    }

    @Test
    public void testGet() throws Exception {
        Instrument collingsGuitar = testInventory.get("11277");

        Assert.assertEquals(Builder.COLLINGS, collingsGuitar.getInstrumentSpec().getBuilder());
        Assert.assertEquals(Type.ACOUSTIC, collingsGuitar.getInstrumentSpec().getType());

        Instrument unavailableGuitar = testInventory.get("11288");

        Assert.assertNull(unavailableGuitar);
    }

    @Test
    public void testAddInstrument() throws Exception {
        Instrument addTestGuitar = new Guitar("11288", 1234.5, new GuitarSpec(Builder.EPIPHONE, "Les Paul", Type.ELECTRIC, 6, Wood.ALDER, Wood.MAHOGANY));

        testInventory.addInstrument(addTestGuitar);

        Instrument guitarInInventory = testInventory.get("11288");
        Assert.assertNotNull(guitarInInventory);
        Assert.assertEquals(guitarInInventory.getInstrumentSpec().getBuilder(), Builder.EPIPHONE);
        Assert.assertEquals(guitarInInventory.getInstrumentSpec().getType(), Type.ELECTRIC);
    }

    @Test
    public void testAddInstrument1() throws Exception {
        testInventory.addInstrument("11288", 1234.5, new MandolinSpec(Builder.MARTIN, "Model 5", Type.ACOUSTIC, Wood.MAHOGANY, Wood.CEDAR, MandolinSpec.Style.A));

        Instrument addTestInstrument = testInventory.get("11288");
        Assert.assertNotNull(addTestInstrument);
        Assert.assertEquals(addTestInstrument.getInstrumentSpec().getBuilder(), Builder.MARTIN);
        Assert.assertEquals(addTestInstrument.getInstrumentSpec().getType(), Type.ACOUSTIC);
    }

    @Test
    public void testSearch() throws Exception {
        Stream<Instrument> matchingInstruments = testInventory.search(new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));

        Assert.assertEquals(2, matchingInstruments.count());
    }
}