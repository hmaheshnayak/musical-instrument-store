package main.java;

/**
 * Created by mahesh on 4/24/2017.
 * Enum listing different types of musical instruments
 */
public enum Type {
    ACOUSTIC, ELECTRIC;

    public String ToString() {
        switch (this) {
            case ACOUSTIC:
                return "Acoustic";
            case ELECTRIC:
                return "Electric";
        }
        return null;
    }
}
