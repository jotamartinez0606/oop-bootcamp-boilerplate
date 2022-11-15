package oop.unitConverter;

public abstract class Measure {

    private double factor;
    private double value;

    public Measure(final double factor, final double value){
        this.factor = factor;
        this.value = value;
    }

    public double convert(double inputMeasure) {
        return inputMeasure * factor;
    }

    public abstract Measure add(Measure valueToAdd);

    public double getValue(){
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
