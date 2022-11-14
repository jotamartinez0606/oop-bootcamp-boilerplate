package oop.dice;

import java.text.DecimalFormat;

public class Chance {

  private double faces = 6.0;
  DecimalFormat rounded = new DecimalFormat("###.00");


  public double chancesOfOneNumberInADice() {

    return Double.parseDouble(rounded.format((1.0 / faces) * 100.0))  ;

  }
}
