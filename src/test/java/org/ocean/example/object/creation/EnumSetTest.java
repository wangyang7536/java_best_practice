package org.ocean.example.object.creation;

import org.junit.Test;

import java.util.EnumSet;

import static org.junit.Assert.assertEquals;

/**
 * Author: ocean
 * Date: 4/5/23 3:56 PM
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
