package com.openclassrooms.robot;

public class Repair_Robot extends Robot
{
	//Instance Attributes
		
		
	//Constructors
		public Repair_Robot()
		{
			
		}
		public Repair_Robot(String name)
		{
			super(name);
		}
		
		
	//Getters	

		
	//Setters 

		
	//Methods
		public void repair(Robot rob)
		{
			boolean isNext = false;// test if the repairing robot is next to the robot to repair
			if ((Math.abs(this.X-1) == rob.X && this.Y == rob.Y) || (Math.abs(this.Y-1) == rob.Y && this.X == rob.X))
			{
				isNext = true;
			}
			
			if (isNext)
			{
				rob.setLP(100);
				System.out.println("The robot " + rob.getName() + " was repair by " + this.name +".");
			}
			else
			{
				System.out.println("The repairing Robot must be next to the robot to repair.");
			}
		}
}
