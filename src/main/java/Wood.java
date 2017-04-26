package main.java;

/**
 * Created by mahesh on 4/24/2017.
 * Enum listing various woods that are used to build musical instruments
 */
public enum Wood {
    ADIRONDACK, BRAZILIANROSEWOOD, CEDAR, COCOBOLO, INDIANROSEWOOD, SITKA, MAPLE, ROSEWOOD, ALDER, MAHOGANY;

    public String ToString() {
        switch (this) {
            case ADIRONDACK:
                return "Adirondack";
            case BRAZILIANROSEWOOD:
                return "Brazilian Rosewood";
            case CEDAR:
                return "Cedar";
            case COCOBOLO:
                return "Cocobolo";
            case INDIANROSEWOOD:
                return "Indian Rosewood";
            case SITKA:
                return "Sitka";
            case MAPLE:
                return "Maple";
            case ROSEWOOD:
                return "Rosewood";
            case ALDER:
                return "Alder";
            case MAHOGANY:
                return "Mahogany";
        }
        return null;
    }
}
