package main.java;

/**
 * Created by mahesh on 4/24/2017.
 * Class that derives from InstrumentSpec Class to add mandolin specific properties
 */
public class MandolinSpec extends InstrumentSpec {
    public enum Style {
        A, F;

        public String ToString() {
            switch (this) {
                case A:
                    return "A";
                case F:
                    return "F";
            }
            return null;
        }
    }

    public MandolinSpec(Builder builder, String model, Type type, Wood topWood, Wood backWood, Style style) {
        super(builder, model, type, topWood, backWood);
        this.style = style;
    }

    private Style style;

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;

        if (!(otherSpec instanceof MandolinSpec))
            return false;

        MandolinSpec mandolinSpec = (MandolinSpec) otherSpec;

        return mandolinSpec.style.equals(style);

    }
}
