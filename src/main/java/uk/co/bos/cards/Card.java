package uk.co.bos.cards;

public class Card {
	private String rank;
	private String suit;
	private int sequence;
	
	public Card(String rank, String suit, int sequence) {
		super();
		this.rank = rank;
		this.suit = suit;
		this.sequence = sequence;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
		

	@Override
	public boolean equals(Object obj) {
		return this.toString().equals(obj.toString());
	}

	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + ", sequence=" + sequence + "]";
	}
	
	
}
