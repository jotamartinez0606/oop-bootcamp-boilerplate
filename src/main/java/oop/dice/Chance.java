package oop.dice;

import java.text.DecimalFormat;

public class Chance {

  double faces = 6.0;

  DecimalFormat rounded = new DecimalFormat("###.00");

  public double chancesOfAnEventHappening() {
    return Double.parseDouble(rounded.format(1.0 / faces));
  }

  public double chancesOfAnEventNotHappening() {
    return (Double.parseDouble(rounded.format(1.0 - chancesOfAnEventHappening())));
  }
}
