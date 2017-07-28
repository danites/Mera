
package AbstractFactory.packaging;

import AbstractFactory.Packaging;

public class HappyKidGiftWrap implements Packaging {
	private double cost = 0D;

	public HappyKidGiftWrap(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
