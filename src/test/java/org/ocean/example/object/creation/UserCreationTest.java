package org.ocean.example.object.creation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: ocean
 * Date: 4/2/23 3:01 PM
 */

public class UserCreationTest {
    @Test
    public void test() {
        User user1 = User.createWithDefaultCountry("Nick", 30);
        assertEquals(user1.getCountry(), Country.CHINA);
    }

    @Test
    public void testLog() {
        User user1 = User.createWithLoggedInstantiationTime("Johan", 28, Country.FRANCE);
        assertEquals(user1.getCountry(), Country.FRANCE);
    }

    @Test
    public void testSingleton() {
        User user1 = User.getSingletonInstance("Neal", 28, Country.UK);
        assertEquals(user1.getCountry(), Country.UK);
    }
}
