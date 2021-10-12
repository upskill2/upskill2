package com.upskill2.datastructures.list;

public class ArrayList implements List {
    Object[] array;
    int size = 0;

    @Override
    public void add(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {
        if ( index > size + 1 || index < -0 ) throw new IndexOutOfBoundsException("Index out of bound ");
             for (int i = array.length - 1; i > index + 1; i --) {
                 array[i] = array [i - 1];
             }
             array [index] = value;
    }

    @Override
    public Object remove(int index) {
        if (index > size - 1 || index < 0 ) throw new IndexOutOfBoundsException("Cant remove object is its out bound ");
        for (int i = index; i < array.length - 1; i ++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
        return array;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(Object value, int index) {
        return null;
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
        return array.length==0;
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