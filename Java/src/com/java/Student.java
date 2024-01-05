package com.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	// private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	// variable argument prijmanie zmena - int[] marks -> int... marks, flexibilita
	// pre argumenty taže mžoe žadat viac vstupnych argumentov
	public Student(String name, int... marks) {
		// TODO Auto-generated constructor stub
		this.name = name;
		// this.marks = marks;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfmarks() {
		// TODO Auto-generated method stub
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		// TODO Auto-generated method stub
		/*
		 * int maximumMark = marks[0]; for (int mark : marks) { if (mark > maximumMark)
		 * maximumMark = mark; } return maximumMark;
		 * 
		 */ return Collections.max(marks);
	}

	public int getMinimumMark() {
		// TODO Auto-generated method stub
		/*
		 * int minimumMark = marks[0]; for (int mark : marks) { if (mark < minimumMark)
		 * minimumMark = mark; } return minimumMark;
		 */ return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		// sum
		// total and devide
		int sum = getTotalSumOfMarks();
		int number = getNumberOfmarks();

		return new BigDecimal(sum).divide(new BigDecimal(marks.size()), 3, RoundingMode.UP);
		// 98,66666666666666666 , Precision(3) 98.667
	}

	public String toString() {
		return name + marks;
	}

}
