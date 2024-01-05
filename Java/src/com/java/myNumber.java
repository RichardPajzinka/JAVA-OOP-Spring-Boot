package com.java;

public class myNumber {

	private int number;

	public myNumber(int number) {
		this.number = number;

	}

	public boolean isPrime() {
		// 2 to number -1
		// how to check if a number is divisible by 2
		for (int i = 2; i <= number - 1; i++) {
		if (number % 2 == 0) {
			return false;
		}
	}
		return true;
	}

	public int sumUptoN() {
		// 1+2+3....number
		// mame 6 = 1+2+3+4+5+6 = 21
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		// except 6 and 1 , 6 => 2+3
		int sum = 0;

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				sum = sum + 1;
			}
		}
		return 0;
	}

}
