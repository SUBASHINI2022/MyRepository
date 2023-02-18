package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringExample1 {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(SpringExample1.class, args);
		GameRunner runner=context.getBean(GameRunner.class);
		runner.rungame();
		
	}
}
class GameRunner
{
GameConsole game;
GameRunner(GameConsole game)
{
	this.game=game;
}
public void rungame()
{
	game.up();
	game.down();
	game.left();
	game.right();
}
}
interface GameConsole
{
	void up();
	void down();
	void right();
	void left();
}
class SuperContra implements GameConsole
{
		public void up()
		{
			System.out.println("up supercontra");
		}
		public void down()
		{
			System.out.println("down supercontra");
		}
		public void right()
		{
			System.out.println("right supercontra");
		}
		public void left()
		{
			System.out.println("left supercontra");
		}
	}
	class PacMan implements GameConsole
	{
		public void up()
		{
			System.out.println("up1 pacman");
		}
		public void down()
		{
			System.out.println("down1 pacman ");
		}
		public void right()
		{
			System.out.println("right1 pacman");
		}
		public void left()
		{
			System.out.println("left1 pacman");
		}
	}
	class MarbName implements GameConsole
	{
		public void up()
		{
			System.out.println("up2 marbname");
		}
		public void down()
		{
			System.out.println("down2 marbname");
		}
		public void right()
		{
			System.out.println("right2 marbname");
		}
		public void left()
		{
			System.out.println("left2 marbname");
		}
	}
	




