package oop.dice;

import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

public class ChanceTest {

  @Test
  public void itShouldReturnChancesOfGettingAnSpecificDiceFace () {
    Chance chance = new Chance();

    assertEquals(16.67, chance.chancesOfOneNumberInADice(), 0.00);

  }


}