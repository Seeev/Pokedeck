import java.util.*;

public class Pokedeck {

	private ArrayList<Card> deck;

	public Pokedeck() {
		this.deck = new ArrayList<Card>();
	}

	public ArrayList<Card> getDeck() {
		return this.deck;
	}

	public void addCard(Card card) {
		this.deck.add(card);
	}
	
	public void removeCard(int index) {
		this.deck.remove(index);
	}
	
	public void modifyCard(int index, Card card) {
		this.deck.set(index, card);
	}
	
	public void show() {
		for(Card card : deck)
			System.out.println(card.toString());
	}
}
