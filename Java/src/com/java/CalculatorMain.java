package com.java;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// Scanner(System.in);
		// citanie zo vstupu
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		// tu mu povieme že ma čitat zo vstupu int
		int number1 = scanner.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = scanner.nextInt();
		// System.out.printf("The number you entered is - %d and second is %d", number1,
		// number2).println();
		System.out.println("Choices available are ");
		System.out.println("1 - add");
		System.out.println("2 - subtract");
		System.out.println("3 - divide");
		System.out.println("4 - multiply");

		System.out.println("Enter choice: ");
		int choice = scanner.nextInt();

		System.out.println("Your Choice are ");
		System.out.println("number 1: " + number1);
		System.out.println("number 2: " + number2);
		System.out.println("choice: " + choice);


		switch (choice) {
		case 1:
			System.out.println("Result " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result " + (number1 / number2));
			break;
		case 4:
			System.out.println("Result " + (number1 * number2));
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}

		/*
		 * if (choice == 1) { System.out.println("Result " + (number1 + number2)); }
		 * else if (choice == 2) { System.out.println("Result " + (number1 - number2));
		 * } else if (choice == 3) { System.out.println("Result " + (number1 /
		 * number2)); } else if (choice == 4) { System.out.println("Result " + (number1
		 * * number2)); } else { System.out.println("Invalid Operation"); }
		 */

	}

}
