
package AbstractFactory.packaging;

import AbstractFactory.Packaging;

public class MerchantCollectionBag implements Packaging {
	private double cost = 0D;

	public MerchantCollectionBag(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
