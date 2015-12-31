
public class Pokemon extends Card {

	private EnergyTypes energy;
	private int stage;
	private int HP;

	public Pokemon(String n, int num, EnergyTypes e, int s, int hp) {
		super(CardFamilies.Pokemon, n, num);
		this.energy = e;
		this.stage = s;
		this.HP = hp;
	}

	public EnergyTypes getEnergy() {
		return this.energy;
	}
	
	public int getStage() {
		return this.stage;
	}
	
	public int getHP() {
		return this.HP;
	}

	public String toString() {
		return this.cardFamily + " Card \n ====== \n"
				+ "Name : " + this.cardName + "\n"
				+ "Energy : " + this.energy + 
				"\nStage : " + this.stage + 
				"\nHP : " + this.HP + "\n ----------";
	}
}
