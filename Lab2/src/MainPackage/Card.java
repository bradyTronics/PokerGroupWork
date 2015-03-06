package MainPackage;

public class Card {
	
	private eRank rank;
	private eSuit suit;
	
	
	public Card(eSuit suit, eRank rank){
		this.suit = suit;
		this.rank= rank;
	}


	public eRank getRank() {
		return rank;
	}


	public eSuit getSuit() {
		return suit;
	}
	
	
	
}
