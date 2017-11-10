package com.openclassrooms.robot;

public class Build_Robot extends Robot
{
	//Instance Attributes
		protected String to_build;
		protected int materials;
			
	//Constructors
		public Build_Robot()
		{
			super();
		}
		public Build_Robot(String name, String _to_build, int _materials)
		{
			super(name);
			this.to_build = _to_build;
			this.materials= _materials;
		}
		
		
	//Getters	
		public String GetTo_build()
		{
			return this.to_build;
		}
		
		public int GetMaterials()
		{
			return this.materials;
		}
		
	//Setters 
		public void SetTo_build (String build)
		{
			this.to_build = build;
		}
		
		public void SetMaterials(int mat)
		{
			this.materials = mat;
		}
		
		
	//Methods
}
