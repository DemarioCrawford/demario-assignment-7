package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	CustomList<String> rappersList;
	
	@BeforeEach
	public void setUp() {
		rappersList = new CustomArrayList<>();
	}

	@Test
	void testAddElementIncreasesSize() {
		rappersList.add("Mac Dre");
		assertEquals(1, rappersList.getSize());
	}
	
	@Test
	public void testAddMultipleElementsIncreasesSize() {
		rappersList.add("Mac Dre");
		rappersList.add("Rooney Rackz");
		rappersList.add("Too Short");
		assertEquals(3, rappersList.getSize());
	}
	//test fails
	@Test
	public void testGetElementAtIndex() {
		rappersList.add("Mac Dre");
		assertEquals("Mac Dre", rappersList.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> rappersList.get(5));
	}
	
	@Test
	public void testGetInvalidIndexReturnsNull() {
		rappersList.add("Mac Dre");
		assertNull(rappersList.get(2));
	}
	
	@Test
	public void testArrayResizeWhenFull() {
		for (int i = 0; i < 15; i++) {
			rappersList.add("Rapper " + i);
		}
		
		assertEquals(15, rappersList.getSize());
		assertEquals("Rapper 14", rappersList.get(14));
	}
	//test fails
	@Test
	public void testRemoveElement() {
		rappersList.add("Mac Dre");
		rappersList.add("40 Water");
		
		assertEquals(1, rappersList.getSize());
		assertEquals("40 Water", rappersList.get(0));
	}
	
	@Test
	public void testContainsElement() {
		rappersList.add("Mac Dre");
		assertTrue(rappersList.contains("Mac Dre"));
		assertFalse(rappersList.contains("Too Short"));
	}

}
