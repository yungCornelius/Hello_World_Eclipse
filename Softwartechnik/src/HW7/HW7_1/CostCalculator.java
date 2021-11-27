package HW7.HW7_1;

public class CostCalculator implements Visitor {

	double c;

	public CostCalculator() {
	}

	@Override
	public void visitFurniture(Furniture f) {
		double w = f.getWeight();
		c = w / 20;
		c = c * 5;
		System.out.print(c);

	}

	@Override
	public void visitGlass(Glass g) {
		int t = g.getTickness();
		double l = g.getLenght();
		if (t == 1) {
			c = (l/100) * 2;
		} else if (t == 2) {
			c = (l/100) * 1.2;
		} else {
			c = (l/100) * 0.7;
		}
		System.out.print(c);
	}

	@Override
	public void visitElectronic(Electronic e) {
		Boolean f = e.getFragile();
		double w = e.getWeight();
		if (f) {
			c = w / 10;

		} else {
			c = w / 15;
		}
		c = c * 5;
		System.out.print(c);
	}

	public void getCosts(HouseholdItem i) {
		i.accept(this);
	}

}
