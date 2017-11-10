package com.openclassrooms.robot;

public class Robot 
{
	//Instance Attributes
	
	protected String name;
	protected double LP; //Life Points
	protected double speed;
	protected int X; //axis X
	protected int Y; //axis Y
	
	
	//Constructors 
	public Robot()
	{
		name = "Unknown";
		LP=100;
		speed = 3;
		X=0;
		Y=0;
	}
	
	public Robot(String _name)
	{
		this.name = _name;
		LP=100;
		speed = 3;
		X=0;
		Y=0;
	}
	
	//Getters
	public String getName()
	{
		return name;
	}
	
	//Setters
	public void setName(String _Name)
	{
		name = _Name;
	}
	
	//Methods
	public void presentation()
	{
		System.out.println("Hi, I'm " + this.name + ". I have " + this.LP + " life points. I'm moving at " + this.speed + " squares per second. "
				+ "I'm at the coordinates (" + this.X + ";" + this.Y +").");
	}
	
}
