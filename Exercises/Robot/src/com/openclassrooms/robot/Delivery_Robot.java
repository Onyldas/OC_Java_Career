package com.openclassrooms.robot;

public class Delivery_Robot extends Robot
{
	//Instance Attributes
	protected String to_carry;
	protected int materials;
	
	
	//Constructors
		public Delivery_Robot(String name)
		{
			super(name);
		}
		public Delivery_Robot(String name, String _to_carry, int _materials)
		{
			super(name);
			this.to_carry = _to_carry;
			this.materials = _materials;
		}
		
		
	//Getters

		public String getTo_carry()
		{
			return this.to_carry;
		}
		public int getMaterials()
		{
			return this.materials;
		}
		
	//Setters 
	
		public void setTo_carry (String carry)
		{
			this.to_carry = carry;
		}
		public void setMaterials (int mat)
		{
			this.materials = mat;
		}
	
	//Methods
		public void deliver(int nb)
		{
			if ((this.materials - nb) > 0)
			{
				System.out.println("The robot " + this.name + " has deliver " + nb + " " + this.to_carry + " here.");
				this.materials -= nb;
			}
			else
			{
				System.out.println("Not enough materials. (" + this.materials + ")" );
			}
		}
		public void replenishMaterials()
		{
			this.setMaterials(20);
		}
}
