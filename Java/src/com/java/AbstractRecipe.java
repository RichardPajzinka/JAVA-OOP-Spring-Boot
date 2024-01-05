package com.java;

public abstract class AbstractRecipe {
	// prepare
	// recipe
	// clean-up

	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void cleanup();

	abstract void doTheDish();

	abstract void getReady();
}
