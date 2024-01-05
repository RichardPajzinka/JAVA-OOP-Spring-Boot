package exeption_handling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// bola by exeption ale nezatvorili by sme scanner taže by sa nam nezatvoirl
		// scanner
		try {

		int[] numbers = { 12, 3, 4, 5 };

		int number = numbers[5];
		System.out.println("before scanner close");
		// scanner.close();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		System.out.println("before scanner close");
		if (scanner != null) {
		scanner.close();
		}
		// System.out.println("before scanner close");
	}
	System.out.println("just before closing out main");
	}

}
