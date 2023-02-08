package by.academy.homework7.task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizeTestDivide extends Assert {

	private double valueX;
	private double valueY;
	private double expected;

	public ParametrizeTestDivide(double valueX, double valueY, double expected) {
		this.valueX = valueX;
		this.valueY = valueY;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "divide: valueX(1) / valueY(2) = expected(3)")
	public static Iterable<Double[]> dataForTest() {
		return Arrays.asList(
				new Double[][]{
						{9.0, 3.0, 3.0},
						{12.0, 4.0, 3.0},
						{21.0, 7.0, 3.0}});
	}

	@Test
	public void paramTestDivide() {
		assertEquals(expected, CustomCalculator.divide(valueX, valueY), 0.01);
	}
}
