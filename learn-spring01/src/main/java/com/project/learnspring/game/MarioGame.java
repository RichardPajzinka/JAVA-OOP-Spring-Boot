package com.project.learnspring.game;

public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("go to the hole");
	}

	public void left() {
		System.out.println("go back");
	}

	public void right() {
		System.out.println("go forward");
	}
}
