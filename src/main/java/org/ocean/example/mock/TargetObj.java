package org.ocean.example.mock;

/**
 * Author: ocean Date: 4/19/23 11:51 AM
 */

public class TargetObj {
  Object value;
  public Object getValue() {
    this.value = Tool.getConfig().get("key");
    return this.value;
  }
}
