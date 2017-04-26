package main.java;

/**
 * Created by mahesh on 4/24/2017.
 * Class that derives from InstrumentSpec Class to add guitar specific properties
 */
public class GuitarSpec extends InstrumentSpec {
    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;

        if (!(otherSpec instanceof GuitarSpec))
            return false;

        GuitarSpec guitarSpec = (GuitarSpec) otherSpec;

        return guitarSpec.numStrings == numStrings;

    }
}
