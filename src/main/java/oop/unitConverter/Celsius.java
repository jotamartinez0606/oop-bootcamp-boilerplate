package oop.unitConverter;

public class Celsius extends Measure {
    private static final double FAHRENHEIT_TO_CELSIUS_FACTOR = 0.5555;

    public Celsius(final double value) {
        super(0.0, value);
    }

    public Celsius() {
        super(0.0, 0.0);
    }

    @Override
    public double convert(double inputMeasure){
        return (inputMeasure - 32) * FAHRENHEIT_TO_CELSIUS_FACTOR;
    }

    public Measure add(Measure valueToAdd) {
        var result = super.getValue() + valueToAdd.getValue();
        return new Celsius(result);
    }
}
