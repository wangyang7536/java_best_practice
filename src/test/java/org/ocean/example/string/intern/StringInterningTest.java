package org.ocean.example.string.intern;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Author: ocean
 * Date: 4/3/23 4:40 PM
 */

public class StringInterningTest {
    @Test
    public void test() {
        String literalStr = "hello world";
        String newStr = new String("hello world");
        assertFalse(literalStr == newStr);
        String internStr = newStr.intern();
        assertTrue(literalStr == internStr);
    }
}
