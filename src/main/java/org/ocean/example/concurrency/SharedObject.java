package org.ocean.example.concurrency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: ocean
 * Date: 4/4/23 11:14 PM
 */

public class SharedObject {
    private static final Logger LOG = LoggerFactory.getLogger(SharedObject.class);
    private ReentrantLock lock = new ReentrantLock(true);
    private int counter = 0;

    public void perform() {
        lock.lock();
        LOG.info("Thread - " + Thread.currentThread().getName() + " acquired the lock");

        try {
            LOG.info("Thread - " + Thread.currentThread().getName() + " incrementing the counter");
            counter++;
        } catch (Exception e) {
            LOG.error(" Interrupted Exception ", e);
        } finally {
            lock.unlock();
            LOG.info("Thread - " + Thread.currentThread().getName() + " released the lock");
        }
    }

    public int getCounter() {
        return counter;
    }
}
