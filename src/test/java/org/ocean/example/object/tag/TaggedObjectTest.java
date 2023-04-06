package org.ocean.example.object.tag;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Author: ocean
 * Date: 4/5/23 4:37 PM
 */

public class TaggedObjectTest {
    @Test
    public void test(){
        TaggedObject obj1 = new TaggedObject(1,"String value");
        TaggedObject obj2 = new TaggedObject(2,20);
        if(obj1.getTag() == 1) {
            assertTrue(obj1.getValue() instanceof String);
        }
        if(obj1.getTag() == 2) {
            assertTrue(obj2.getValue() instanceof Integer);
        }
    }
}
