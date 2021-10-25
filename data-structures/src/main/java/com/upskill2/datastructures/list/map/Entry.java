package com.upskill2.datastructures.list.map;

class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setValue(V value) {
    }

    public Object getKey() {
    }
    // getters & setters
    // hashCode & equals

    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) id;
        hash = 31 * hash + (key == null ? 0 : key.hashCode());
        hash = 31 * hash + (value == null ? 0 : value.hashCode());
        return hash;
    }
}
}