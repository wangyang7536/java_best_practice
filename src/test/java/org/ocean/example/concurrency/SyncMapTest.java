package org.ocean.example.concurrency;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: ocean
 * Date: 4/4/23 11:38 PM
 */

public class SyncMapTest {
    @Test
    public void test() throws InterruptedException {
        final int threadCount = 4;
        final ExecutorService service = Executors.newFixedThreadPool(threadCount);
        final MyThreadSafeMap map = new MyThreadSafeMap();
        executeThreads(map, threadCount, service);
        Thread.sleep(1000);
        System.out.println(MyThreadSafeMap.getMap());
        service.shutdown();
    }

    private void executeThreads(MyThreadSafeMap map, int threadCount, ExecutorService service) {
        for (int i = 0; i < threadCount; i++) {
            int finalI = i;
            service.execute(new Thread() {
                @Override
                public void run() {
                    map.put("key" + finalI, "value" + finalI);
                }
            });
            service.execute(new Thread() {
                @Override
                public void run() {
                    map.get("key" + finalI);
                }
            });
        }
    }
}
