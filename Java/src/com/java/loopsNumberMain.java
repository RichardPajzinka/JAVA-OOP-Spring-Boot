package com.java;

public class loopsNumberMain {

	public static void main(String[] args) {
		myNumber number = new myNumber(6);
		boolean isPrime = number.isPrime();
		System.out.println("isprime " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("sum " + sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sumoddivirosion" + sumOfDivisors);

	}


}
