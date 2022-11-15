package oop.unitConverter;

public class Meter extends Measure {

    private static final double METERS_TO_INCHES = 39.3701;

    public Meter(final double value) {
        super(METERS_TO_INCHES, value);
    }

    public Meter() {
        super(METERS_TO_INCHES, 0.0);
    }

    public Measure add(Measure valueToAdd) {
        var result = super.getValue() + valueToAdd.getValue();
        return new Meter(result);
    }
}
