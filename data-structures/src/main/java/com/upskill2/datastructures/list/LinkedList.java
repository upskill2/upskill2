package com.upskill2.datastructures.list;

public class LinkedList implements List {
    Object[] array = new Object[5];
    Node head;
    Node tail;
    int size;

    @Override
    public void add(Object value) {
        if (size == 0) {
            head = tail = new Node();
        }
    }

    @Override
    public void add(Object value, int index) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void set(Object value, int index) {
            }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }
}
