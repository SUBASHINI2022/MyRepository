package com.example.demo;

public class SpringExample {

	public static void main(String[] args) {
		
			//supercontra mg=new supercontra();
			pacman mg1=new pacman();
			gamerunner g=new gamerunner(mg1);
			g.rungame();
			
		}
	}
class gamerunner
{
	pacman mg;
	gamerunner(pacman mg1)
	{
		mg=mg1;
}
	public void rungame()
	{
		mg.up();
		mg.down();
		mg.left();
		mg.right();
	}
}
class supercontra
{
			public void up()
			{
				System.out.println("up");
			}
			public void down()
			{
				System.out.println("down");
			}
			public void right()
			{
				System.out.println("right");
			}
			public void left()
			{
				System.out.println("left");
			}
		}
		class pacman
		{
			public void up()
			{
				System.out.println("up1");
			}
			public void down()
			{
				System.out.println("down1");
			}
			public void right()
			{
				System.out.println("right1");
			}
			public void left()
			{
				System.out.println("left1");
			}
		}
		class marbname
		{
			public void up()
			{
				System.out.println("up2");
			}
			public void down()
			{
				System.out.println("down2");
			}
			public void right()
			{
				System.out.println("right2");
			}
			public void left()
			{
				System.out.println("left2");
			}
		}
		

	
