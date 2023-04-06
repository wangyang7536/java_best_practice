package org.ocean.example.object.tag;

/**
 * Author: ocean
 * Date: 4/5/23 4:35 PM
 * <p>
 * Tagged classes represent a value that can take on different types at runtime.
 */

public class TaggedObject {
    private int tag;
    private Object value;

    public TaggedObject(int tag, Object value) {
        this.tag = tag;
        this.value = value;
    }

    public int getTag() {
        return tag;
    }

    public Object getValue() {
        return value;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
