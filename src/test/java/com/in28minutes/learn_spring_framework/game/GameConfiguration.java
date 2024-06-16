package com.in28minutes.learn_spring_framework.game;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

@Bean 
public GamingConsole game(){
    var game = new PacManGame();
    return game;
}

@Bean
public GameRunner gameRunner(@Qualifier("SuperContraGameQualifier")GamingConsole game){
    var gameRunner = new GameRunner(game());
    return gameRunner;

}
}

