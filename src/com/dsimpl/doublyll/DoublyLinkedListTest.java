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
        list.add(9);
        System.out.println("list : "+list.toString());
    }

}