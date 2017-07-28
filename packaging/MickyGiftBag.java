
package AbstractFactory.packaging;

import AbstractFactory.Packaging;

public class MickyGiftBag implements Packaging {

	private double cost = 0D;

	public MickyGiftBag(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
