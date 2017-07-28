
package AbstractFactory.packaging;

import AbstractFactory.Packaging;

public class EveryDayValueWrap implements Packaging {
	private double cost = 0D;

	public EveryDayValueWrap(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
