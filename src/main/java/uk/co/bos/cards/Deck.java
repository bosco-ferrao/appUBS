package uk.co.bos.cards;

import java.util.ArrayList;
//import java.util.Collections;//could be used
import java.util.List;
import java.util.Random;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, and check if empty.
 */
public class Deck {
	
		
	/**
	 * cards contains all the cards in the deck.
	 */
	private ArrayList<Card> cards = new ArrayList<Card>();

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits) {
		int sequence = 0;
		for(int i = 0; i < ranks.length; i++) {
			for(String s : suits) {
				Card newCard = new Card(ranks[i], s, sequence++);
				cards.add(newCard);
			}
		}
		size = cards.size();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if(cards.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* 1 efficient way */
		Random rand = new Random();
		size = cards.size();
		for(int i = size-1; i > 0; i--) {
			Card temp = cards.get(i);
			int rng = rand.nextInt(i+1);
			cards.set(i, cards.get(rng));
			cards.set(rng, temp);
		}
		
		/* Most efficient way */
		//Collections.shuffle(cards);
	}
	
	public List<Card> getCards() {
		return (List<Card>) this.cards.clone();
	}

	
	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\n Cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			// Insert carriage returns so entire deck is visible on console.
			rtn = rtn + "\n";
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
