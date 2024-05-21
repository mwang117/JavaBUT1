package helloassertj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class helloAssertj {

	@Test
	void test_hello_with_assertEquals_Junit5() {
		String hello = "hello AssertJ !";
		assertEquals("hello AssertJ !", hello);
	}
}
