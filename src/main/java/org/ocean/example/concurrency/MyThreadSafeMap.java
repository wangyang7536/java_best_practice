package org.ocean.example.concurrency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Author: ocean
 * Date: 4/4/23 11:20 PM
 */

public class MyThreadSafeMap {
    private static Map<String, Object> map = new HashMap<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();
    private Logger logger = LoggerFactory.getLogger(MyThreadSafeMap.class);

    public static Map<String, Object> getMap() {
        return map;
    }

    public void put(String key, Object value) {
        try {
            writeLock.lock();
            logger.info(Thread.currentThread().getName() + " putting key, value pair : " + key + ", " + value);
            map.put(key, value);
        } finally {
            writeLock.unlock();
        }
    }

    public Object remove(String key) {
        try {
            writeLock.lock();
            logger.info(Thread.currentThread().getName() + " removing entry by key : " + key);
            return map.remove(key);
        } finally {
            writeLock.unlock();
        }
    }

    public Object get(String key) {
        try {
            readLock.lock();
            logger.info(Thread.currentThread().getName() + " getting entry by key : " + key);
            return map.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public boolean containsKey(String key) {
        try {
            readLock.lock();
            logger.info(Thread.currentThread().getName() + " checking existence by key : " + key);
            return map.containsKey(key);
        } finally {
            readLock.unlock();
        }
    }
}
