package com.upskill2.datastructures.list;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayListTest {

    ArrayList arrayList = new ArrayList();

    @AfterEach
    @DisplayName ("clear()")
    void afterEach() {
        arrayList.clear();
    }

    @Test
    @DisplayName("Initialize the Array")
    void testInit(){
        assertFalse(arrayList.isEmpty());
        assertEquals(arrayList.size(),5);
    }

    @Test
    void testSize (){
        arrayList.add("A",0);
        arrayList.add("A",1);
        arrayList.add("A",2);
        arrayList.add("A",3);
        arrayList.add("A",4);
        assertEquals(5,arrayList.size);
    }

    @Test
    void add(){
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("B",2);
        arrayList.add("B");
        arrayList.add(null);
        assertEquals("A", arrayList.get(0));
        assertEquals(null, arrayList.get(4));
        assertEquals("B", arrayList.get(2));
    }

    @Test
    void get(){
        assertThrows(IndexOutOfBoundsException.class, ()-> arrayList.get(7));
    }

    @Test
    void remove(){
        arrayList.add("A", 0);
        arrayList.add("B", 1);
        arrayList.add("C", 2);
        arrayList.remove(1);
        arrayList.add(null);
        for (int i = 0; i < 4; i++) {
            System.out.println(arrayList.get(i));
            assertEquals("C", arrayList.get(1));
        }
    }

    @Test
    void set(){
        arrayList.add("A",0);
        arrayList.add("B",1);
        arrayList.add("B",2);
        arrayList.set("Z",2);
        arrayList.set("W",0);
            for (int i = 0; i < 4; i ++) {
                System.out.println(arrayList.get(i));
                assertEquals("W", arrayList.get(0));
                assertEquals("Z", arrayList.get(2));
           }
        }

       @Test
       void lastIndexOf(){
        arrayList.add("A",0);
        arrayList.add("B",1);
        arrayList.add("B",2);
        arrayList.add("A",3);
        assertEquals(3,arrayList.lastIndexOf("A"));
       }

       @Test
       void IndexOf(){
        arrayList.add("A",0);
        arrayList.add("Z",1);
        assertEquals(1,arrayList.indexOf("Z"));
       }

    @Test
    void isEmpty() {
        arrayList.add("A",0);
        assertEquals(false,arrayList.isEmpty());
    }

    @Test
    void contains(){
        arrayList.add("A",0);
        assertEquals(true,arrayList.contains("A"));
    }

        public String toString(){
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        for (int i = 0; i < 5; i++) {
        stringJoiner.add("A").toString();
            }
            return stringJoiner.toString();
        }
    }
