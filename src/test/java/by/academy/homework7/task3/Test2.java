package by.academy.homework7.task3;

import org.junit.Assert;
import org.junit.Test;

public class Test2 extends Assert {

	@Test(timeout = 100)
	public void mathSquareRootTimeoutTest() {
		assertEquals(2, Math.sqrt(4), 0.01);
	}

	@Test
	public void mathSquareRootEqualsTest() {
		assertEquals(4, Math.sqrt(16), 0.01);
	}

	@Test
	public void mathSquareRootNotEqualsTest() {
		assertNotEquals(20, Math.sqrt(6), 0.01);
	}
}
