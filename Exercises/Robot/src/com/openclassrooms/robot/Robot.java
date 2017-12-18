package com.openclassrooms.robot;

abstract class Robot 
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
		public double getLP()
		{
			return this.LP;
		}
		public int getX()
		{
			return this.X;
		}
		public int getY()
		{
			return this.Y;
		}
		public double getSpeed()
		{
			return this.speed;
		}
		
		
	//Setters
		public void setName(String _Name)
		{
			name = _Name;
		}
		public void setLP(double life)
		{
			this.LP = life;
		}
		public void setX(int _X)
		{
			this.X = _X;
		}
		public void setY(int _Y)
		{
			this.Y = _Y;
		}
		public void setSpeed (double sp)
		{
			this.speed = sp;
		}
		
	//Methods
		public void presentation()
		{
			System.out.println("Hi, I'm " + this.name + ". I have " + this.LP + " life points. I'm moving at " + this.speed + " squares per second. "
				+ "I'm at the coordinates (" + this.X + ";" + this.Y +").");
		}
		
		public void deplacement(int newX, int newY)
		{
			this.X = newX;
			this.Y = newY;
			System.out.println("Le robot " + this.name + " se situe maintenant aux coordonnées (" + newX + ";" + newY +")");
		}
		public boolean isHome()
		{
			boolean bool = false;
			if (this.X == 0 && this.Y == 0)
			{
				bool = true;
			}
			return bool;
		}
	
}
