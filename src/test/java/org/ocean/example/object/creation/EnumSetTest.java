package org.ocean.example.object.creation;

import static org.junit.Assert.assertEquals;

import java.util.EnumSet;
import org.junit.Test;

/**
 * Author: ocean Date: 4/5/23 3:56 PM
 */

public class EnumSetTest {

  @Test
  public void test() {
    EnumSet<SignalLight> set = EnumSet.allOf(SignalLight.class);
    assertEquals(3, set.size());
  }

  enum SignalLight {
    GREEN,
    RED,
    YELLOW;
  }
}
