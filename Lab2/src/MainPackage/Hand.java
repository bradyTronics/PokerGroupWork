package MainPackage;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> hand;
	
	private Hand(Deck c){
		ArrayList<Card> hand1 = new ArrayList<Card>();
		for (int x = 0; x < 5; x++){
			hand1.add(c.DrawFromDeck());
		}
			hand = hand1;
			}
	
	
	
	
		
	
	
}
