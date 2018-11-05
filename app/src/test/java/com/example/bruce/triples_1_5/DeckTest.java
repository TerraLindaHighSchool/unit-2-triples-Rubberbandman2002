package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void createShuffledDeck() {
        Deck deck = new Deck(81);
        Card topCard;
        Card nextCard;
        for(int i = 0; i < 40; i++) {
            topCard = deck.getTopCard();
            nextCard = deck.getTopCard();
            assertTrue(!topCard.equals(nextCard));
        }
    }

    @Test
    public void getNumCardsInDeck() {
        Deck deck = new Deck(81);
        int expectedValue = 81;
        int actualValue = deck.getNumCardsInDeck();
        assertTrue(actualValue == expectedValue);
    }

    @Test
    public void getTopCard() {
        Deck deck = new Deck(81);
        Card expectedValue =  deck.getCard(0);
        Card actualValue = deck.getTopCard();
        assertTrue(actualValue.equals(expectedValue));
    }
}