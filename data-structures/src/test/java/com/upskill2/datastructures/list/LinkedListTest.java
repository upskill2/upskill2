package com.upskill2.datastructures.list;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LinkedListTest {

    LinkedList linkedList = new LinkedList();

    @BeforeEach
    void beforeEach() {
        for (int i = 0; i < 1; i++) {
            linkedList.add(i);
        }
    }

    @AfterEach
    @DisplayName("clear()")
    void afterEach() {
        linkedList.clear();
    }

    @Test
    void testAdd() {
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        assertEquals(4,linkedList.size());
        linkedList.print();
    }

    @Test
    void testAddByIndexWhenAddingToHead(){
        linkedList.add(1);
        assertEquals(2,linkedList.size());
        linkedList.add("A", 0);
        assertEquals(2,linkedList.size());
        assertEquals("A", linkedList.head.value);
        assertEquals(1, linkedList.get(1));
    }

    @Test
    void testAddByIndex(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.print();
     //   assertEquals(3,linkedList.size());
        linkedList.add("A", 0);
        linkedList.add("Z", 2);
        linkedList.add("Q");
        linkedList.print();
        assertEquals("Z",linkedList.get(2));
        assertEquals(5,linkedList.size());

    }
    @Test
    void testAddByIndexMoveElements(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.print();
        assertEquals(3,linkedList.size());
        linkedList.addMoveElements("A", 0);
        linkedList.addMoveElements("Z", 2);
        linkedList.print();
        assertEquals("Z",linkedList.get(2));
        assertEquals(5,linkedList.size());

    }

    @Test
    void testAddByIndexWhenSizeLessThenIndex(){
        assertThrows(IndexOutOfBoundsException.class, ()-> linkedList.add("A",2));
    }

    @Test
    void testAddByIndexWhenIndexLessThanZero(){
        assertThrows(IndexOutOfBoundsException.class, ()-> linkedList.add("A",-1));
    }

    @Test
    void testRemoveIfSizeIsOne() {
        linkedList.add("A",0);
        linkedList.print();
        System.out.println(linkedList.size());
        assertEquals(0,linkedList.remove(0));
    }

    @Test
    void testGetIndexMoreThanSize() {
        assertThrows(IndexOutOfBoundsException.class, ()-> linkedList.get(1));
    }

    @Test
    void testGetIndexLessThanZero() {
        assertThrows(IndexOutOfBoundsException.class, ()-> linkedList.get(-1));
    }

    @Test
    void testGetIndexEqualsSize() {
        assertEquals(0, linkedList.get(0));
    }

    @Test
    void testGetFirstIndex_ShouldReturnHead() {
        linkedList.add(1);
        assertEquals(linkedList.head.value, linkedList.get(0));
    }

    @Test
    void testGetLastIndex_ShouldReturnTail() {
        linkedList.add(1);
        assertEquals(linkedList.tail.value, linkedList.get(1));
    }

    @Test
    void testGetIndexWithinSize() {
        linkedList.add(1);
        linkedList.add(2);
        assertEquals(2, linkedList.get(2));
    }

    @Disabled
    @Test
    void testSet() {
    }

    @Test
    void testClear() {
        linkedList.clear();
        assertEquals(0,linkedList.size());
    }

    @Test
    void testSize() {
        assertEquals(1,linkedList.size());
    }

    @Test
    void testIsEmpty() {
        assertEquals(false,linkedList.isEmpty());
    }

    @Disabled
    @Test
    void testContains() {
    }

    @Test
    void testIndexOf() {
        linkedList.addMoveElements("B",0);
        linkedList.addMoveElements("A",1);
        linkedList.addMoveElements("C",2);
        linkedList.print();
        assertEquals(2,linkedList.indexOf("C"));
    }

    @Test
    void testLastIndexOf() {
        linkedList.add("B");
        linkedList.add("B");
        linkedList.add("A");
    assertEquals(1,linkedList.lastIndexOf("B"));
    }
}