import java.io.Serializable;

public abstract class Card implements Serializable {

	protected CardFamilies cardFamily;
	protected String cardName;
	protected int cardNumber;
	
	public Card(CardFamilies f, String n, int num) {
		this.cardFamily = f;
		this.cardName = n;
		this.cardNumber = num;
	}
	
	public CardFamilies getCardFamily() {
		return this.cardFamily;
	}
	
	public String getCardName() {
		return this.cardName;
	}
	
	public int getCardNumber() {
		return this.cardNumber;
	}
}
