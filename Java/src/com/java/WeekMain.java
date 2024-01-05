package com.java;

public class WeekMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String mostNumberInLetter = "";
		for(String day:daysOfWeek) {
			if(day.length() > mostNumberInLetter.length()) {
				mostNumberInLetter = day;
			}
		}
		System.out.println(mostNumberInLetter.length());
		
		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}

	}

}
