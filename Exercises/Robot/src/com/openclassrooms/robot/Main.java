package com.openclassrooms.robot;

public class Main 
{

	public static void main(String[] args) 
	{
		Robot[] robots = {new Robot("Wall_e"), new Robot("R2D2"), new Robot("Robocop"), new Robot("Terminator")};
		for (Robot robot : robots)
		{
			robot.presentation();
			System.out.println();
		}
	}

}
