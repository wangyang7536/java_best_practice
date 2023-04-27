package org.ocean.example.mock;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Author: ocean Date: 4/19/23 11:53 AM
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({
    Tool.class
})
public class MockTest {

  @Before
  public void setup() {
    PowerMockito.mockStatic(Tool.class);
  }

  @Test
  public void test() {
    Map<String, Object> mockMap = Map.of("key", "value");
    PowerMockito.when(Tool.getConfig()).thenReturn(mockMap);
    Object utilValue = Util.getValue();
    TargetObj obj = new TargetObj();
    Object targetObjValue = obj.getValue();
    assertEquals(utilValue, targetObjValue);
  }
}
