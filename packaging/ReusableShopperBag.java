
package AbstractFactory.packaging;

import AbstractFactory.Packaging;

public class ReusableShopperBag implements Packaging {

	private double cost = 0D;

	public ReusableShopperBag(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
