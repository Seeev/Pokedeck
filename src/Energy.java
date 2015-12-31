
public class Energy extends Card {

	private EnergyTypes EnergyType;

	public Energy(String n, int num, EnergyTypes e) {
		super(CardFamilies.Energy, n, num);
		this.EnergyType = e;
	}

	public EnergyTypes getType() {
		return this.EnergyType;
	}

	public String toString() {
		return this.cardFamily + " Card \n ====== \nType : " + this.EnergyType + "\n ----------";
	}
}
