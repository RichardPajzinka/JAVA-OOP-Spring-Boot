package com.java;

public class MarioGameMainMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// GamingConsole mario = new MarioGame();
		// GamingConsole game = new ChessGame();
		GamingConsole[] games = { new MarioGame(), new ChessGame() };

		for (GamingConsole game : games) {
			game.down();
			game.left();
		}
		// game.down();
		// game.left();
	}

}
