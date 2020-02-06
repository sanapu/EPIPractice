package com.epipractice.implement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
	DoublyLinkedList dl ;
//	@BeforeAll
//	public void setUp() {
//		dl = new DoublyLinkedList();
//	}

	@Test
	void testAdd() {
		dl = new DoublyLinkedList();
		dl.add(8);
		dl.add(9);
		dl.add(10);
		dl.add(11);
		
		System.out.println(dl.toString());
		
		dl.addFirst(6);
		
		System.out.println(dl.toString());
		
	}

}
