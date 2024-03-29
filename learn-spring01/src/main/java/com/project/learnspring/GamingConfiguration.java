package com.project.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.learnspring.game.GameRunner;
import com.project.learnspring.game.GamingConsole;
import com.project.learnspring.game.PacManGame;

@Configuration
public class GamingConfiguration {
	

	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

	// TODO Auto-generated method stub
			// var game = new MarioGame();
			// var game = new SuperContraGame();
	// var game = new PacManGame();
	/*
	 * var gameRunner = new GameRunner(game); gameRunner.run();
	 */

}
