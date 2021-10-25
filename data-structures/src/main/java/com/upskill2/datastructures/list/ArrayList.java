package com.upskill2.datastructures.list;

public class ArrayList implements List {
    Object[] array = new Object[5];
       int size;

    @Override
    public Object get(int index) {
        if( index > size || array == null) {
            throw new IndexOutOfBoundsException("Index out of bound " + index);
        }
        return array[index];
    }

    @Override
    public void add(Object value) {
      if(array == null){
          array = new Object[5];
      }
        array[size] = value;
        size++;
    }

    @Override //TO Do test with 20 lenght and index==10
    public void add(Object value, int index) {
        if ( index > array.length || index < 0 ) throw new IndexOutOfBoundsException("Index out of bound " + index);

          System.arraycopy(array, index, array,index + 1,size - index);
             array [index] = value;
             size++;
    }

    @Override
    public Object remove(int index) {
        if (index > size - 1 || index < 0 ) throw new IndexOutOfBoundsException("Cant remove object is its out bound ");
        if (array.length - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        array[array.length - 1] = null;
        return array;
    }

    @Override
    public void set(Object value, int index) {
        if(index > size || index <0) {
            throw new IndexOutOfBoundsException("Index out of bound " + index);
        }
        System.arraycopy(array, index, array,index,size);
        array [index] = value;
        size++;
    }

    public boolean valueIsInArray (Object value) {

        boolean valueIsInArray = false;

        for (Object o : array) {
            valueIsInArray = value == o;

        }
        return valueIsInArray;
    }

    @Override
    public void clear() {
        size = 0;

    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return array.length==0;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) != -1;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < 5; i++){
            if (value.equals(array[i])){
                return i;
            }
        }
            return -1;
    }

    @Override
    public int lastIndexOf(Object value) {
        for (int i = size; i >= 0; i--) {
            if (value.equals(array[i])) {
                return i;
            }
        } return -1;
    }
}