package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{
@Override public void up() {
	System.out.println("Jump");
	
}



@Override public void down() {
	System.out.println("Go into hole");
}
@Override public void left() {
	System.out.println("Go Back");
}
@Override public void right() {
	System.out.println("Accelerate");
}

}
