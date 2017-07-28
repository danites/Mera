
package AbstractFactory.packaging;

import AbstractFactory.Packaging;

public class HolidaySurpriseWrap implements Packaging {
	private double cost = 0D;

	public HolidaySurpriseWrap(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
