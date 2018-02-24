package rps6;

public class Tool {
	
	private int strength;
	private char type;
	
	Tool (int s){
		this.strength = s;
	}
	
	public int getStrength () {
		return this.strength;
	}
	
	public void setStrength (int strength) {
		this.strength = strength;
	}
	
	public char getType () {
		return this.type;
	}
	
	public void setType (char type) {
		this.type = type;
	}
	

}
