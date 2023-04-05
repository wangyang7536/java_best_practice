package org.ocean.example.object.creation;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author: ocean
 * Date: 4/2/23 2:44 PM
 */

public class User {
    private static final Logger LOGGER = Logger.getLogger(User.class.getName());
    private static volatile User instance = null;

    String name;
    int age;

    public Country getCountry() {
        return country;
    }

    Country country;

    public User(String name, int age, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public static User getSingletonInstance(String name, int age, Country country) {
        if(instance == null) {
            synchronized (User.class) {
                if(instance == null) {
                    instance = new User(name,age,country);
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static User createWithDefaultCountry(String name, int age) {
        return new User(name, age, Country.CHINA);
    }

    public static User createWithLoggedInstantiationTime(String name, int age, Country country) {
        LOGGER.log(Level.INFO, "Creating user instance at : {0}", LocalTime.now());
        return new User(name, age, country);
    }
}
