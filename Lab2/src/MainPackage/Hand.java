package MainPackage;

import java.util.ArrayList;

public class Hand extends Deck{
	
	private ArrayList hand;
	
	private Hand(Deck c){
		hand = new ArrayList();
		hand.add(c.DrawFromDeck());
			}
	
	
	
	
		
	
	
}
