package main.java;

/**
 * Created by mahesh on 4/22/2017.
 * Abstract
 */
public class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood topWood;
    private Wood backWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood topWood, Wood backWood) {
        this.builder = builder;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public boolean matches(InstrumentSpec instrumentSpec) {
        if (instrumentSpec == null)
            return false;

        if (!instrumentSpec.backWood.equals(backWood))
            return false;

        if (!instrumentSpec.topWood.equals(topWood))
            return false;

        if (!instrumentSpec.builder.equals(builder))
            return false;

        return instrumentSpec.model.equals(model);

    }
}
