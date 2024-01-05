package junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math = new MyMath();

	@Test
	void test() {
		// fail("Not yet implemented");
		int[] numbers = { 1, 2, 3 };
		MyMath math = new MyMath();
		int result = math.calculateSum(numbers);
		System.out.println(result);
		
		int expectedResult = 6;
		assertEquals(expectedResult, result);
	}

	@Test
		void calculateSum_zeroLengthArray() {
			assertEquals(0,math.calculateSum(new int[] {}));
		}
	}


