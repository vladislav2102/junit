package by.academy.homework7.task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizeTestSubtraction extends Assert {

	private double valueX;
	private double valueY;
	private double expected;

	public ParametrizeTestSubtraction(double valueX, double valueY, double expected) {
		this.valueX = valueX;
		this.valueY = valueY;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "subtraction: valueX(1) - valueY(2) = expected(3)")
	public static Iterable<Double[]> dataForTest() {
		return Arrays.asList(
				new Double[][]{
						{3.0, 2.0, 1.0},
						{9.0, 5.0, 4.0},
						{21.0, 11.0, 10.0}});
	}

	@Test
	public void paramTestSubtraction() {
		assertEquals(expected, CustomCalculator.subtraction(valueX, valueY), 0.01);
	}
}
