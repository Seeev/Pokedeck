
public class Trainer extends Card {

	private String TrainerType;
	private String TrainerTextbox;
	private String TrainerRule;

	public Trainer(String n, int num, String t, String text, String r) {
		super(CardFamilies.Trainer, n, num);
		this.TrainerType = t;
		this.TrainerTextbox = text;
		this.TrainerRule = r;
	}

	public String getType() {
		return this.TrainerType;
	}
	
	public String getTextbox() {
		return this.TrainerTextbox;
	}
	
	public String getRule() {
		return this.TrainerRule;
	}

	public String toString() {
		return this.cardFamily + " Card \n ====== \n"
				+ "Type : " + this.TrainerType + 
				"\n\nTextbox : " + this.TrainerTextbox + 
				"\n\nRule : " + this.TrainerRule + "\n ----------";
	}
}
