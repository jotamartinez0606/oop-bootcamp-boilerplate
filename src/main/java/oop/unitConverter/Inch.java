package oop.unitConverter;

public class Inch extends Measure {

    private static final double INCHES_TO_YARDS = 0.0278;

    public Inch(final double value) {
        super(INCHES_TO_YARDS, value);
    }

    public Inch() {
        super(INCHES_TO_YARDS, 0.0);
    }

    public Measure add(Measure valueToAdd) {
        double valueToAddInInches = valueToAdd.getValue();
        if(valueToAdd instanceof Meter) {
            valueToAddInInches = valueToAdd.convert(valueToAdd.getValue());
        }
        var result = super.getValue() + valueToAddInInches;
        return new Inch(result);
    }


}
