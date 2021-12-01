package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
//String suits representa el tipo de cartas
//String values representa el valor de cada carta
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
//Se encarga de almacenar cartas en la baraja
		ArrayList<Card> deck = new ArrayList<Card>();
//Este for indica que el tipo y valor  de carta es mayor que 0
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
//Calcula aleatoriamente el tipo y el valor de cada carta
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
//Da 5 cartas con tipo y valor aleatorios.
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
