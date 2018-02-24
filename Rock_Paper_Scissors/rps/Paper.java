package rps6;

import java.util.Random;

public class Paper extends Tool{
	
	Paper (int s){
		super (s);
		this.setType('p');
		
	}
	
	boolean fight (Tool t) {
		int power = this.getStrength();
		boolean isWinner;
		
		switch (t.getType()) {
		
		case 'r': // Rock
			power *=2; // double strength
			break;
		case 's': // Scissors
			power /=2; // half strength
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
			t = new Rock (9);
			System.out.println ("Compter Chooses Rock");
		}
		else {
			t = new Scissors (5);
			System.out.println ("Compter Chooses Scissors");
		}
		
		
		switch (t.getType()) {
		
		case 'r': // Rock
			power *=2; // double strength
			break;
		case 's': // Scissors
			power /=2; // half strength
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

