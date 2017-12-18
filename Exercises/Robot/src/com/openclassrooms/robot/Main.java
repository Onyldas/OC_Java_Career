package com.openclassrooms.robot;
import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		/*Robot[] robots = {new Delivery_Robot("Wall_e"), new Repair_Robot("R2D2"), new Build_Robot("Robocop"), new Build_Robot("Terminator")};
		for (Robot robot : robots)
		{
			robot.presentation();
			System.out.println();
		}*/
		Delivery_Robot Wall_e = new Delivery_Robot("Wall_e", "rocks",20);
		Repair_Robot R2D2 = new Repair_Robot("R2D2");
		Build_Robot Robocop = new Build_Robot("Robocop");
		Build_Robot Terminator = new Build_Robot("Terminator");
		
		
		int choix = sc.nextInt();
		
		switch (choix)
		{
			//Delivery Robot example
			case 0:
				Wall_e.deliver(5);
				Wall_e.deliver(20);
				break;
			//Repairing Robot example
			case 1:
				Wall_e.setLP(50);
				Wall_e.presentation();
				R2D2.repair(Wall_e);
				R2D2.deplacement(1,0);
				R2D2.presentation();
				R2D2.repair(Wall_e);
				Wall_e.presentation();
				break;
			//Build_Robot example
			case 2:
				Robocop.buildRobot();
				
		}
		
		
	}

}
