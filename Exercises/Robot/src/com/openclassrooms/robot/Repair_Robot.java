package com.openclassrooms.robot;

public class Repair_Robot extends Robot
{
	//Instance Attributes
		protected String to_repair;
		
		
	//Constructors
		public Repair_Robot()
		{
			super();
		}
		public Repair_Robot(String name, String _to_repair)
		{
			super(name);
			this.to_repair = _to_repair;
		}
		
		
	//Getters	
		public String GetTo_repair()
		{
			return this.to_repair;
		}
		
	//Setters 
		public void SetTo_repair (String repair)
		{
			this.to_repair = repair;
		}
		
		
	//Methods
}
