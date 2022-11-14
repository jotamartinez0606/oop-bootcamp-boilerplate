package oop.dice;

import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

public class ChanceTest {
  Chance chance = new Chance();
  @Test
  public void itShouldReturnAChanceOFAnEventHappening() {

    assertEquals(0.17, chance.chancesOfAnEventHappening(), 0.00);

  }

  @Test
  public void itShouldReturnChancesOfNotGettingAnSpecificDiceFace () {

    assertEquals(0.83, chance.chancesOfAnEventNotHappening(), 0.00);

  }



}