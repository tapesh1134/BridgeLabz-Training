package org.junitpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ListManagerTest {
	
	ListManager listManager= new ListManager();
	List<Integer> list = new ArrayList<>();
	
	
	@Test
	void testAddElement() {
		listManager.addElement(list, 10);
		assertTrue(list.contains(10));
	}
	
	@Test
	void testRemoveElement() {
		list.add(20);
		listManager.removeElement(list, 20);
		assertFalse(list.contains(20));
	}
	
	@Test
	void testGetSize() {
		assertEquals(list.size(), listManager.getSize(list));
	}
}
