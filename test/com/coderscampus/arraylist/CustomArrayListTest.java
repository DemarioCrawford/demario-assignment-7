package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	CustomList<String> rappers;
	
	@BeforeEach
	public void setUp() {
		rappers = new CustomArrayList<>();
	}

	@Test
	void testAddElementIncreasesSize() {
		rappers.add("Mac Dre");
		assertEquals(1, rappers.getSize());
	}
	
	@Test
	public void testAddMultipleElementsIncreasesSize() {
		rappers.add("Mac Dre");
		rappers.add("Rooney Rackz");
		rappers.add("Too Short");
		assertEquals(3, rappers.getSize());
	}
	//test fails
	@Test
	public void testGetElementAtIndex() {
		rappers.add("Mac Dre");
		rappers.add("40 Water");
		assertEquals("Mac Dre", rappers.get(0));
		assertEquals("40 Water", rappers.get(1));
	}
	
	@Test
	public void testGetInvalidIndexReturnsNull() {
		rappers.add("Mac Dre");
		assertNull(rappers.get(2));
	}
	
	@Test
	public void testArrayResizeWhenFull() {
		for (int i = 0; i < 15; i++) {
			rappers.add("Rapper " + i);
		}
		
		assertEquals(15, rappers.getSize());
		assertEquals("Rapper 14", rappers.get(14));
	}
	//test fails
	@Test
	public void testRemoveElement() {
		rappers.add("Mac Dre");
		rappers.add("40 Water");
		assertTrue(rappers.remove("Mac Dre"));
		assertEquals(1, rappers.getSize());
	}
	
	@Test
	public void testContainsElement() {
		rappers.add("Mac Dre");
		assertTrue(rappers.contains("Mac Dre"));
		assertFalse(rappers.contains("Too Short"));
	}

}
