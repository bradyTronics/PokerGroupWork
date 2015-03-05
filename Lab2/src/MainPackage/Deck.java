package MainPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.UUID;


public class Deck {
	private ArrayList<Card> deck;
	
	public Deck(){
		for(int i = 0; i < 4; i++){
			eSuit suit = eSuit.values()[i];
			for(int j = 0; j < 14; j++){
				eRank rank = eRank.values()[j];
			    deck.add(new Card(suit, rank));
			}
		}
		Collections.shuffle(deck);
	}
	
	
	
	public Card DrawFromDeck(){
		Card c = deck.get(0);
		deck.remove(c);
		return c;
	}
	
	public int getRemainders(){
		return (deck.size());
	}
	
}
