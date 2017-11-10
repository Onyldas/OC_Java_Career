package com.openclassrooms.robot;

public class Delivery_Robot extends Robot
{
	//Instance Attributes
	protected String destination;
	protected String to_carry;
	
	
	//Constructors
		public Delivery_Robot()
		{
			super();
		}
		public Delivery_Robot(String name, String _destination, String _to_carry)
		{
			super(name);
			this.destination = _destination;
			this.to_carry = _to_carry;
		}
		
		
	//Getters
		public String GetDestination()
		{
			return this.destination;
		}
		
		public String GetTo_carry()
		{
			return this.to_carry;
		}
	
	//Setters 
		public void SetDestination (String dest)
		{
			this.destination = dest;
		}
	
		public void SetTo_carry (String carry)
		{
			this.to_carry = carry;
		}
	
	
	//Methods
	
	
}
