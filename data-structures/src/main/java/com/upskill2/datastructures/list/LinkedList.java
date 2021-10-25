package com.upskill2.datastructures.list;

public class LinkedList implements List {
    Object[] array = new Object[5];
    Node head;
    Node tail;
    int size;

    // TO DO FROM TAIL IF 999 AND YOU HAVE 1000
    //TO DO MAKE LINKED LIST + TESTS

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
            current.next = head.next; //head 0 index && tail last element
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
        // These are 2 reference changes, as compared to adding at index 0
        newNode.next = current.next; // here we are changing a refernce
        current.next = newNode; // changing a reference here as well
          }

    public void addMoveElements(Object value, int index)
    {
        if ( index > size() ) {
            throw new IndexOutOfBoundsException("Index out of bound " + index);
        }

        Node current = head; //iterate through whole list
        int pos = 0;
        Node newNode = new Node(value);

        if (head == null || index == 0) // special case, since its a single reference change!
        {
            newNode.next = head;
            head = newNode; // this node is now the head
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
        // These are 2 reference changes, as compared to adding at index 0
        newNode.next = current.next; // here we are changing a refernce
        current.next = newNode; // changing a reference here as well

    }

    @Override
    public Object remove(int index) {
        if ( index > size || index < 0 ) {
            throw new IndexOutOfBoundsException("Index out of bound " + index);
        }
        if(index==0){

        }
        if( index+1 == size) {
            return 0;
        }
        return 0;
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
        return false;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value)!= -1;
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
        return 0;
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
