package com.dsimpl.doublyll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void add() {

        DoublyLinkedList list = new DoublyLinkedList();

        list.add(2);
        list.add(6);
        list.add(3);
        list.add(39);
        list.add(9);
        System.out.println("list : "+list.toString());

        list.addFirst(1);
        System.out.println("list : "+list.toString());
        System.out.println("list size addfirst: "+list.getSize());

        list.addAtIndex(1,99);
        System.out.println("list size:add at index "+list.getSize());
        list.add(100);
        System.out.println("list : "+list.toString());

        list.removeFirst();
        System.out.println("list : "+list.toString());
        System.out.println("list size: after remove at first "+list.getSize());

        list.removeLast();
        System.out.println("list : "+list.toString());
        System.out.println("list size: after remove at last "+list.getSize());

        list.removeAtIndex(2);
        System.out.println("list : "+list.toString());
        System.out.println("list size: after remove at index 2  "+list.getSize());

    }

}