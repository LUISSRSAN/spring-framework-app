package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.PacManGame;

public class App01Gaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var marioGame = new MarioGame();
		//var superContra = new SuperContraGame();
		var pacMan = new PacManGame();
		var gameRunner = new GameRunner(pacMan);
		
		gameRunner.run();
		
	}

}
