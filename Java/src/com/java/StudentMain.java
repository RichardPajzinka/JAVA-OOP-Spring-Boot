package com.java;

import java.math.BigDecimal;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 99, 98, 100 };
		Student student = new Student("Ranga", marks);

		int number = student.getNumberOfmarks();
		System.out.println("number of marks: " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("total sum of marks: " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("maximum number: " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("minimum number in this array is: " + minimumMark);
		 
		BigDecimal average = student.getAverageMarks();
		System.out.println(student);
		// student.addMark(35);
		// student.removeMarkAtIndex(5);

	}

}
