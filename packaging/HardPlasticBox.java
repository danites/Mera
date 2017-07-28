
package AbstractFactory.packaging;

import AbstractFactory.Packaging;

public class HardPlasticBox implements Packaging {
	private double cost = 0D;

	public HardPlasticBox(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
