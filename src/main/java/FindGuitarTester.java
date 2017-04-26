package main.java;

import java.util.stream.Stream;

/**
 * Created by mahesh on 4/24/2017.
 * Class that test musical instruments inventory for adding and searching of guitars
 */
public class FindGuitarTester {
    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

//        main.java.Guitar whatErinLikes = new main.java.Guitar("", 0, "fender", "Stratocastor",
//                "electric", "Alder", "Alder");
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);

        Stream<Instrument> matchingInstruments = inventory.search(whatErinLikes);
        if (matchingInstruments != null) {
            matchingInstruments.forEach(matchedInstrument -> System.out.println("Erin, you might like this " +
                    matchedInstrument.getInstrumentSpec().getBuilder() + " " +
                    matchedInstrument.getInstrumentSpec().getModel() + " " +
                    matchedInstrument.getInstrumentSpec().getType() + " guitar:\n   " +
                    matchedInstrument.getInstrumentSpec().getBackWood() + " back and sides,\n   " +
                    matchedInstrument.getInstrumentSpec().getTopWood() + " top.\nYou can have it for only $" +
                    matchedInstrument.getPrice() + "!"));
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }


    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument(new Guitar("11277", 3999.95,
                new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIANROSEWOOD, Wood.SITKA)));
        inventory.addInstrument(new Guitar("V95693", 1499.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER)));
        inventory.addInstrument(new Guitar("V9512", 1549.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER)));
        inventory.addInstrument(new Guitar("122784", 5495.95,
                new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6, Wood.MAHOGANY, Wood.ADIRONDACK)));
        inventory.addInstrument(new Guitar("76531", 6295.95,
                new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6, Wood.BRAZILIANROSEWOOD, Wood.ADIRONDACK)));
        inventory.addInstrument(new Guitar("70108276", 2295.95,
                new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAPLE)));
        inventory.addInstrument(new Guitar("82765501", 1890.95,
                new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAHOGANY)));
        inventory.addInstrument(new Guitar("77023", 6275.95,
                new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6, Wood.BRAZILIANROSEWOOD, Wood.ADIRONDACK)));
        inventory.addInstrument(new Guitar("1092", 12995.95,
                new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 6, Wood.INDIANROSEWOOD, Wood.CEDAR)));
        inventory.addInstrument(new Guitar("566-62", 8999.95,
                new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 6, Wood.COCOBOLO, Wood.CEDAR)));
        inventory.addInstrument(new Guitar("6 29584", 2100.95,
                new GuitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAPLE)));
    }
}
