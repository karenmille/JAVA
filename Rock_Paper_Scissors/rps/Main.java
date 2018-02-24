package rps6;
//Karen Miller

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scissors s1 = new Scissors (5);
	Rock r1 = new Rock (9);
	Paper p1 = new Paper (7);
	Tool t1 = new Tool (0);
	
	System.out.println("Scissors v. Paper");
	if (s1.fight(p1)) {
	System.out.println("Scissors Wins");
	}
	else {
	System.out.println("Paper Wins");
	}
	
	System.out.println("Scissors v. Rock");
	if (s1.fight(r1)) {
	System.out.println("Scissors Wins");
	}
	else {
	System.out.println("Rock Wins");
	}
	
	System.out.println("Paper v. Rock");
	if (p1.fight(r1)) {
	System.out.println("Paper Wins");
	}
	else {
	System.out.println("Rock Wins");
	}
	
	System.out.println("Paper v. Computer");
	if (p1.vsComputer(t1)) {
	System.out.println("Paper Wins");
	}
	else {
	System.out.println("Computer Wins");
	}
	
	System.out.println("Rock v. Computer");
	if (r1.vsComputer(t1)) {
	System.out.println("Rock Wins");
	}
	else {
	System.out.println("Computer Wins");
	}
	
	System.out.println("Scissors v. Computer");
	if (s1.vsComputer(t1)) {
	System.out.println("Scissors Wins");
	}
	else {
	System.out.println("Computer Wins");
	}
	
	

	
	}

}
