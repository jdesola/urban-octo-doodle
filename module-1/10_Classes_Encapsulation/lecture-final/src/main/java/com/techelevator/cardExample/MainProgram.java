package com.techelevator.cardExample;

import java.util.List;

import com.techelevator.cards.Card;
import com.techelevator.cards.Deck;

public class MainProgram {

	public static void main(String[] args) {
		Card aceOfSpades = new Card("s", "A");

		System.out.println(aceOfSpades);

		aceOfSpades.flip();

		System.out.println(aceOfSpades);

		Card twoOfHearts = new Card("h", "2");
		twoOfHearts.flip();
		System.out.println(twoOfHearts);

		Deck deckOfCards = new Deck();

		System.out.println(deckOfCards);

		deckOfCards.shuffle();

		System.out.println(deckOfCards);

		Card topCard = deckOfCards.deal();
		topCard.flip();

		System.out.println(topCard);
		
		topCard = deckOfCards.deal();
		topCard.flip();

		System.out.println(topCard);
		
		topCard = deckOfCards.deal();
		topCard.flip();

		System.out.println(topCard);

		topCard.flip();
		deckOfCards.addCard(topCard);
		
		System.out.println(deckOfCards);
		
		List<Card> cards = deckOfCards.deal(3);
		System.out.println(cards);
		System.out.println(deckOfCards);
		
		
		
		
	}

}
