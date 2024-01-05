package com.project.learnspring;

import com.project.learnspring.game.GameRunner;
import com.project.learnspring.game.PacManGame;

public class App01GamingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var game = new MarioGame();
		// var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
