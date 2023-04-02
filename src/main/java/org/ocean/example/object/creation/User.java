package org.ocean.example.object.creation;

/**
 * Author: ocean
 * Date: 4/2/23 2:44 PM
 */

public class User {

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static User createWithDefaultCountry(String name, int age) {
        return new User(name, age, Country.CHINA);
    }
}
