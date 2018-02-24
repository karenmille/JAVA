package rps6;

import java.util.Random;

public class Scissors extends Tool{
	
	
	Scissors (int s){
		super (s);
		this.setType('s');
		
	}
	
	boolean fight (Tool t) {
		int power = this.getStrength();
		boolean isWinner;
		
		switch (t.getType()) {
		
		case 'r': // Rock
			power /=2; // half strength
			break;
		case 'p': // Paper
			power *=2; // double strength
			break;
			
		default:
			break;
		
		}
		
		if (power > t.getStrength()) 
			isWinner = true;	
		else
			isWinner = false;
		
		
		return isWinner;
				
	}
	
	boolean vsComputer (Tool t) {
		
		Random random = new Random ();
		int coinFlip = random.nextInt(2);
		int power = this.getStrength();
		boolean isWinner;
		
		
		if (coinFlip == 0) {
			t = new Paper (9);
			System.out.println ("Compter Chooses Paper");
		}
		else {
			t = new Rock (5);
			System.out.println ("Compter Chooses Rock");
		}
		
		
	switch (t.getType()) {
		
		case 'r': // Rock
			power /=2; // half strength
			break;
		case 'p': // Paper
			power *=2; // double strength
			break;
			
		default:
			break;
		
		}
		
		
		if (power > t.getStrength()) 
			isWinner = true;	
		else
			isWinner = false;
		
		
		return isWinner;
		
		
		
		
		
	}	
		
	
		
		

}
