package main.java;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by mahesh on 4/22/2017.
 * Class that maintains list of the musical instruments available in the store
 * Instruments can be searched for by providing specifications
 */
public class Inventory {
    private ArrayList<Instrument> instruments;

    public Inventory() {
        this.instruments = new ArrayList<>();
    }

    public Inventory(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public Instrument get(String serialNumber) {
        return instruments.stream().filter(instrument -> instrument.getSerialNumber().equals(serialNumber)).findFirst().orElse(null);
    }

    public void addInstrument(Instrument instrument) {
        this.instruments.add(instrument);
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        Instrument newInstrument = null;

        if (instrumentSpec instanceof GuitarSpec) {
            newInstrument = new Guitar(serialNumber, price, (GuitarSpec) instrumentSpec);
        } else if (instrumentSpec instanceof MandolinSpec) {
            newInstrument = new Mandolin(serialNumber, price, (MandolinSpec) instrumentSpec);
        }

        instruments.add(newInstrument);
    }

    public Stream<Instrument> search(InstrumentSpec searchSpec) {
        return instruments.stream().filter(instrument -> instrument.getInstrumentSpec().matches(searchSpec));
    }
}
