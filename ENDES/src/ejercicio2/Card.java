package ejercicio2;
//crea la clase card
public class Card {

	public String suit;
	public String value;
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
//crea una estructura que almacena una carta