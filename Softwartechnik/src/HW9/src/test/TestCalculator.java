package HW9.src.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import HW9.src.main.Calculator;

class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(2, calculator.add(1, 1));
	}

	@ParameterizedTest
	@CsvSource({"1,1","2,2","3,3"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		assertNotNull(calculator.add(valueOne,valueTwo));
		assertEquals(valueOne+valueTwo, calculator.add(valueOne,valueTwo));
	}

	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(0, calculator.sub(1, 1));
	}

	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(4, calculator.multiply(2, 2));
	}

	@Test
	public void Should_divide_two_numbers_and_return_result() {
		assertEquals(2, calculator.divide(4, 2));
	}

	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		assertThrows(ArithmeticException.class,() -> calculator.divide(4, 0),"Divide should throw ArithmeticException when denominator is zero");
	}
}
