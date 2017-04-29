package main.java;

/**
 * Created by mahesh on 4/29/2017.
 * Enum that lists types of Mandolin in terms of design style
 */
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
