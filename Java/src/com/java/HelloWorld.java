package com.java;

public class HelloWorld {

	public static void main(String[] args) {
		// vytovrenie instancie pre class book = vytovrenie instancii taže objectov
		Book ArtOfComputer = new Book(100);
		Book EffectiveJava = new Book(100);
		Book CleaCode = new Book(100);

		// ArtOfComputer.setNoOfCopies(80);
		EffectiveJava.setNoOfCopies(40);
		CleaCode.setNoOfCopies(90);

		ArtOfComputer.increaseBook(10);
		ArtOfComputer.decreaseBook(100);
		System.out.println(ArtOfComputer.getNoOfCopies());
	}

}
