package com.java;

public class MulriplicationTable {
	
	// refactoring
	void printMultiplicationTable() {
		printMultiplicationTable(5, 1, 10);
	}
	
	// tu zavolam metodu pod sebou
	void printMultiplicationTable(int a) {
		printMultiplicationTable(a, 1, 10);
	}
	
		void printMultiplicationTable(int a, int from, int to) {
		for(int i = from;i <=to;i++) {
			System.out.printf("%d * %d = %d",a,i,a*i).println();
			}
		}
	}



