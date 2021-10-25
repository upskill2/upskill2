package com.upskill2.datastructures.list.queue;

public interface Queue {
    void enqueue (Object value); //add element into the end of a queue

    Object dequeue (); // get element from the queue beginning and size - 1

    Object peek(); // just read the object and returns reference

    int size();
}
