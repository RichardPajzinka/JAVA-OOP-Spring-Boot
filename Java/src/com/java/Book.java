package com.java;

public class Book {
	// noOfCopies
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void increaseBook(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseBook(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

}
