package org.ocean.example.mock;

/**
 * Author: ocean Date: 4/19/23 11:50 AM
 */

public class Util {
  public static Object getValue() {
    return Tool.getConfig().get("key");
  }
}
