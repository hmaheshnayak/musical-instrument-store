package main.java;

/**
 * Created by mahesh on 4/24/2017.
 * Enum listing various musical instruments manufacturers
 */
public enum Builder {
    OLSON, COLLINGS, MARTIN, FENDER, GIBSON, EPIPHONE, SCHECTER, PRS, RYAN;

    public String ToString() {
        switch (this) {
            case OLSON:
                return "Olson";
            case COLLINGS:
                return "Collings";
            case MARTIN:
                return "Martin";
            case FENDER:
                return "Fender";
            case GIBSON:
                return "Gibson";
            case EPIPHONE:
                return "Epiphone";
            case SCHECTER:
                return "Schecter";
            case PRS:
                return "PRS";
            case RYAN:
                return "Ryan";
        }
        return null;
    }
}


