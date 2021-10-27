/*
package com.upskill2.datastructures.list.map;

import java.util.Objects;

public class HashMap {

    private int CAPACITY = 10;
    private MapBucket[] bucket;
    private int size = 0;

    public HashMap() {
        this.bucket = new MapBucket[CAPACITY];
    }
    private int getHash(K key) {
        return (key.hashCode() & 0xfffffff) % CAPACITY;
    }

    private Entry getEntry(K key) {
        int hash = getHash(key);
        for (int i = 0; i < bucket[hash].getEntries().size(); i++) {
            Entry entry = bucket[hash].getEntries().get(i);
            if(entry.getKey().equals(key)) {
                return entry;
            }
        }
        return null;
    }
    public void put(K key, V value) {
        if(containsKey(key)) {
            Entry entry = getEntry(key);
            entry.setValue(value);
        } else {
            int hash = getHash(key);
            if(bucket[hash] == null) {
                bucket[hash] = new MapBucket();
            }
            bucket[hash].addEntry(new Entry<>(key, value));
            size++;
        }
    }

    public V get(K key) {
        return containsKey(key) ? (V) getEntry(key).getValue() : null;
    }

    public boolean containsKey(K key) {
        int hash = getHash(key);
        return !(Objects.isNull(bucket[hash]) || Objects.isNull(getEntry(key)));
    }

    public void delete(K key) {
        if(containsKey(key)) {
            int hash = getHash(key);
            bucket[hash].removeEntry(getEntry(key));
            size--;
        }
    }
    public int size() {
        return size;
    }

}
*/
