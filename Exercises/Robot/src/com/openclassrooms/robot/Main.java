package com.openclassrooms.robot;

public class Main 
{

	public static void main(String[] args) 
	{
		Robot[] robots = {new Delivery_Robot("Wall_e"), new Repair_Robot("R2D2"), new Build_Robot("Robocop"), new Build_Robot("Terminator")};
		for (Robot robot : robots)
		{
			robot.presentation();
			System.out.println();
		}
	}

}
