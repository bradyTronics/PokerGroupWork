package MainPackage;

public enum eRank {
	
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGTH(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14),
	JOKER(99);
	
	private int rank;
	private eRank(int rankValue){
		this.rank = rankValue;
	}
	
	public int getRank(){
		return rank;
	}
	
}
