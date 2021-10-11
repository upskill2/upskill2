package com.upskill2.datastructures.list;

public class ArrayListTest {

    public static void main(String[] args) {
        List  list = new ArrayList();
       int size = 10;

        list.add("some");
        System.out.println(list);

        System.out.println(list.size());

        list.add("some1");
        System.out.println(list);

        list.add("some2");
        System.out.println(list);

        System.out.println(list.size());
    }
}
