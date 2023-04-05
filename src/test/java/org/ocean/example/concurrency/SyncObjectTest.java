package org.ocean.example.concurrency;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.assertEquals;

/**
 * Author: ocean
 * Date: 4/4/23 11:53 PM
 */

public class SyncObjectTest {
    @Test
    public void test() throws InterruptedException {
        final int threadCount = 4;
        final ExecutorService service = Executors.newFixedThreadPool(threadCount);
        final SharedObject object = new SharedObject();
        executeThreads(object, threadCount, service);
        Thread.sleep(1000);
        assertEquals(object.getCounter(), 4);
        service.shutdown();
    }

    private void executeThreads(SharedObject object, int threadCount, ExecutorService service) {
        for (int i = 0; i < threadCount; i++) {
            service.execute(object::perform);
        }
    }
}
