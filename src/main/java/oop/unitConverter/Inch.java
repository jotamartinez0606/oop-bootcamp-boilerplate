package oop.unitConverter;

public class Inch extends Measure {

    private static final double INCHES_TO_YARDS = 0.0278;

    public Inch(final double value) {
        super(INCHES_TO_YARDS, value);
    }

    public Inch() {
        super(INCHES_TO_YARDS, 0.0);
    }

    public Measure add(double valueToAdd) {
        var result = super.getValue() + valueToAdd;
        return new Inch(result);
    }
}
