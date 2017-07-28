
package AbstractFactory.packaging;

import AbstractFactory.Packaging;

public class PlainPaperBox implements Packaging {
	private double cost = 0D;

	public PlainPaperBox(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
