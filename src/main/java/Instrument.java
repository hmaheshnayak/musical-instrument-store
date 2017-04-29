package main.java;

/**
 * Created by mahesh on 4/22/2017.
 * Class that models a musical instrument
 */
public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }

    public void setInstrumentSpec(InstrumentSpec instrumentSpec) {
        this.instrumentSpec = instrumentSpec;
    }
}
