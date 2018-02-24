package rps6;

import java.util.Random;

public class Rock extends Tool{
	Rock (int s){
		super (s);
		this.setType('r');
		
	}
	
	boolean fight (Tool t) {
		int power = this.getStrength();
		boolean isWinner;
		
		switch (t.getType()) {
		
		case 's': // Rock
			power *=2; // double strength
			break;
		case 'p': // Paper
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
		t = new Paper (9);
		System.out.println ("Compter Chooses Paper");
	}
	else {
		t = new Scissors (5);
		System.out.println ("Compter Chooses Scissors");
	}
	
	
	switch (t.getType()) {
	
	case 's': // Rock
		power *=2; // double strength
		break;
	case 'p': // Paper
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

