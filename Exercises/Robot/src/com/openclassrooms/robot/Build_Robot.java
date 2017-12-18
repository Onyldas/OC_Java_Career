package com.openclassrooms.robot;

public class Build_Robot extends Robot {
	// Instance Attributes
	protected int pieces;
	protected int nbClone;

	// Constructors
	public Build_Robot(String name) {
		super(name);
		this.nbClone = 0;
		this.pieces = 3;
	}

	public Build_Robot(String name, int _pieces) {
		super(name);
		this.pieces = _pieces;
		this.nbClone = 0;
	}

	// Getters
	public int getPieces() {
		return this.pieces;
	}

	// Setters
	public void setPieces(int piece) {
		this.pieces = piece;
	}

	// Methods
	public void buildRobot() {
		if (this.pieces > 0) {
			this.pieces -= 1;
			this.nbClone++;
			Robot rob = new Build_Robot(this.name + this.nbClone);
			System.out.println("A new robot has been built !\n  ");
			rob.presentation();
		} else {
			System.out.println("The robot don't have enough pieces.");
		}
	}

	public void ReplenishPieces() {
		if (this.isHome()) {
			this.pieces = 3;
			System.out.println(this.name + "has now 3 pieces.");
		} else {
			System.out.println("You have to go home first !");
		}
	}
}
