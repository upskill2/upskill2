package com.upskill2.datastructures.list;

public class LinkedList implements List {
    Object[] array = new Object[5];
    Node head;
    Node tail;
    int size;

    @Override
    public void add(Object value) {
        if (size == 0) {
            head = tail = new Node(value);
            size ++;
            return;
        } else {
            Node current = new Node(value);
            tail.next = current;
            current.prev = tail;
            tail = current;
            size++;
        }
    }

    @Override
    public void add(Object value, int index) {
        if ( index > size || index < 0 ) {
            throw new IndexOutOfBoundsException("Index out of bound " + index);
        }
        int pos = 0;
        Node newNode = new Node(value);
        Node current = head;
        if (head == null || index == 0) {
            current = new Node(value);
            current.next = head.next;
            head.prev = current.next;
            head = current;
            return;
        }
        while (current.next != null) {
            if (pos == index - 1) {
                break;
            }
            pos++;
            current = current.next;
           }
        newNode.next = current.next;
        current.next = newNode;
        size++;
          }

    public void addMoveElements(Object value, int index)
    {
        if ( index > size() ) {
            throw new IndexOutOfBoundsException("Index out of bound " + index);
        }

        Node current = head;
        int pos = 0;
        Node newNode = new Node(value);

        if (head == null || index == 0)
        {
            newNode.next = head;
            head = newNode;
            return;
        }
        while (current.next != null) {
            if (pos == index - 1) {
                break;
            }
            pos++;
            current = current.next;
            size++;
        }
        newNode.next = current.next;
        current.next = newNode;

    }

    @Override
    public Object remove(int index) {
        if ( index > size+1 || index < 0 ) {
            throw new IndexOutOfBoundsException("Index out of bound " + index);
        }
        if (size == 1){
            head = tail = null;
            size=0;
            return index;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current = current.prev;
            current.next = current.next;
            current.next = null;
        }
        return size--;
    }

    @Override
    public Object get(int index) {
        if ( index + 1 > size || index < 0 ) {
            throw new IndexOutOfBoundsException("Index out of bound " + index);
        }
        if (index == 0) {
            return head.value;
        }
        if (index + 1 == size) {
            return tail.value;
        }
        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x.value;
    }

    @Override
    public void set(Object value, int index) {
        if ( index < 0 || size == 0 ) {
            throw new IndexOutOfBoundsException("Index out of bound " + index);
        }
        // TO DO
            }

    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public int size() {
       int i = 0;
       Node current = head;
       while (current != null) {
           i ++;
           current = current.next;
       }
       return i;
    }

    @Override
    public boolean isEmpty() {
        return array.length==0;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value)!= -1;
    }

    @Override
    public int indexOf(Object value) {
        Node current = head;
        for (int i = 1; i < size+1; i++) {
            current = current.next;
            if (current.value.equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object value) {

        int index = 0;
        Node current = head;

        while(current != null) {
                        if(current.value.equals(value)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void print(){
        if (size()== 0) {
            return;
        }
        Node current = head;
        while (current.next != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.print(current.value + "\n");
    }

}
