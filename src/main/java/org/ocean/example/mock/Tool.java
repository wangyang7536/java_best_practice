package org.ocean.example.mock;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: ocean Date: 4/19/23 11:47 AM
 */

public class Tool {

  static Map<String, Object> map;

  public static Map<String, Object> getConfig() {
    if (map == null) {
      map = new HashMap<>();
    }
    return map;
  }

}
