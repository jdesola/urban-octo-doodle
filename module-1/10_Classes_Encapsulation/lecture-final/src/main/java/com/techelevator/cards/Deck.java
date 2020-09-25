package com.techelevator.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private final static String[] suits = { "c", "s", "d", "h" };
	private final static String[] ranks = { 
			"A", "1", "2", "3" , "4", "5", "6", 
			"7", "8", "9", "T", "J", "Q", "K" };
	
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		for (String suit : suits) {
			for (String rank : ranks) {
				Card currentCard = new Card(suit, rank);
				cards.add(currentCard);
			}
		}
	}
	
	public Card deal() {
		if (cards.size() != 0) {
			return cards.remove(0);
		} else {
			return null;
		}
	}
	
	public List<Card> deal(int numberOfCards) {
		List<Card> dealtCards = new ArrayList<Card>();
		
		if (cards.size() >= numberOfCards) {
			for (int i = 0; i < numberOfCards; i++) {
				dealtCards.add(cards.remove(0));
			}
		} 
		
		return dealtCards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	// Delegate Method
	public int size() {
		return cards.size();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	private void flip() {
		for (Card playingCard : cards) {
			playingCard.flip();
		}
	}
	
	public String toString() {
		flip();
		String cardsAsStr = "Deck [" + cards + "]";
		flip();
		return cardsAsStr;
	}
	
}
