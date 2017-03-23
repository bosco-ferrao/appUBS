package uk.co.bos.cards;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class DeckTest {

	@Test
	public void simpleTest() {
		String[] ranks = { "jack", "queen", "king", "ace" };
		String[] suits = { "diamond" };

		Deck d = new Deck(ranks, suits);
		List<Card> oldCards = d.getCards();
		System.out.println(d);
		d.shuffle();
		List<Card> newCards = d.getCards();
		System.out.println(d);
		boolean flag = true;
		int size = oldCards.size(), i = 0;
		for (Card newCard : newCards) {
			for (i = 0; flag && i < oldCards.size(); i++) {
				if (oldCards.get(i).equals(newCard)) {
					break;
				}
			}
			flag = i < size;
			if (!flag) {
				break;
			}
		}
		assertTrue("Cards are missing", flag);
	}

	@Test
	public void fullDeckTest() {
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };
		String[] suits = { "heart", "diamond", "club", "spade" };

		Deck d = new Deck(ranks, suits);
		List<Card> oldCards = d.getCards();
		System.out.println(d);
		d.shuffle();
		List<Card> newCards = d.getCards();
		System.out.println(d);
		boolean flag = true;
		int size = oldCards.size(), i = 0;
		for (Card newCard : newCards) {
			for (i = 0; flag && i < oldCards.size(); i++) {
				if (oldCards.get(i).equals(newCard)) {
					break;
				}
			}
			flag = i < size;
			if (!flag) {
				break;
			}
		}
		assertTrue("Cards are missing", flag);
	}

}
