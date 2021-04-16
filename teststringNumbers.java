package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class teststringNumbers {

	@Test
	public void test() {
		jUnitTesting junit=new jUnitTesting();
		String result =junit.addString("ab", "cd");
		assertEquals("abcd", result);
		
	}

}
