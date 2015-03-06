package MainPackage;

import java.util.ArrayList;

public class Hand extends Deck {
	
	private ArrayList<Card> hand;
	
	private Hand(Deck c){
		ArrayList<Card> hand1 = new ArrayList<Card>();
		for (int i = 0; i < 5; i++){
			hand1.add(c.DrawFromDeck());
		}
			hand = hand1;
			}
	
	public void sortHand(){
		ArrayList<Card> sortedHand = new ArrayList<Card>();
		
		for (int i = 12; i >= 0; i--){
			for(int j = 0; j <= 4; j++){
				if(hand.get(j).getRank() == i ){
					sortedHand.add(hand.get(j));
				}
			}
		}
		hand = sortedHand;
		
	}
	
	
		
	
	
}
