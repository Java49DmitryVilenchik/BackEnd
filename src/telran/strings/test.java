package telran.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static telran.strings.StringTests.*;


class test {

	@Test
	void testCharat() {
		assertEquals('I', charat("I love world"));
	}
	@Test
	void compartTo() {
		assertEquals(0, StringTests.compartTo("I Love Java", "I Love Java"));
		assertEquals(1, StringTests.compartTo("Java", "I Love Java"));
	}
	@Test
	void compareToIgnoreCase() {
		assertEquals(0, StringTests.compareToIgnoreCase("I Love Java", "I Love Java"));
		assertEquals(0, StringTests.compareToIgnoreCase("I Love Java", "i love java"));
		assertEquals(-31, StringTests.compartTo("Java", "i love java"));
	}
	@Test
	void concat() {
		assertEquals("I love Tel-Aviv", StringTests.concat("I love ", "Tel-Aviv"));
	}
	@Test
	void startWith() {
		assertTrue(StringTests.startWith("Hello", "Hel", 0));
	}
	@Test
	void endWith() {
		assertTrue(StringTests.endWith("Hello", "llo"));
	}
	@Test
	void contains() {
		assertTrue(StringTests.contains("Hello", "llo"));
		assertFalse(StringTests.contains("Hello", "Ma"));
	}
	@Test
	void indexOf() {
		assertEquals(0, StringTests.indexOf("Hello", "H"));
		assertEquals(14, StringTests.indexOf("Hello Word. I am ready", "am"));
	}
	@Test
	void lastIndexOf() {
		assertEquals(14, StringTests.lastIndexOf("Hello. Yo Yo Body", 'o'));
		assertEquals(3, StringTests.lastIndexOf("Hello", 'l'));
	}
}
