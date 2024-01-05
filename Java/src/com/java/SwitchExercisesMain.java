package com.java;

public class SwitchExercisesMain {

	public static void main(String[] args) {
		dayOfWeek(3);

	}

	public static String dayOfWeek(int dayNumber) {
		// return null;
		switch (dayNumber) {
		case 1:
			System.out.println("Pondelok");
			break;
		case 2:
			System.out.println("Utorok");
			break;
		case 3:
			System.out.println("Streda");
			break;
		case 4:
			System.out.println("stvrtok");
			break;
		default:
			System.out.println("Ostatne");
		}
		return null;
	}

}
