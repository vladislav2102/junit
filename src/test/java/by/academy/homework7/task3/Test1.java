package by.academy.homework7.task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class Test1 extends Assert {

	@Test(timeout = 100)
	public void mathPowTimeoutTest() {
		assertEquals(16, Math.pow(2, 4), 0.01);
	}

	@Test
	public void mathPowEqualsTest() {
		assertEquals(4, Math.pow(2, 2), 0.01);
	}

	@Test
	public void mathPowNotEqualsTest() {
		assertNotEquals(25, Math.pow(5, 2), 0.01);
	}
}
