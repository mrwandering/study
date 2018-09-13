package com.tian.demoStudy.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class SpringBootTestDemo {
	
	@Test
	public String testOne() {
		System.out.println("hello world");
		TestCase.assertEquals(1, 1);
		assertEquals(1, 1);
		return "test";
	}
	
}
