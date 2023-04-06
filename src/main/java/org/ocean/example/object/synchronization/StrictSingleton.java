package org.ocean.example.object.synchronization;

/**
 * Author: ocean
 * Date: 4/4/23 7:43 PM
 */

public class StrictSingleton {
    private static StrictSingleton instance;

    private StrictSingleton() {

    }

    /**
     * Utilizing double check lock pattern
     * @return
     */
    public static StrictSingleton getInstance() {
        if (instance == null) {
            synchronized(StrictSingleton.class) {
                if(instance == null) {
                    instance = new StrictSingleton();
                }
            }
        }
        return instance;
    }
}
