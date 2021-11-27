package HW7.HW7_1;

public class PackingInstructor implements Visitor {

	public PackingInstructor() {
	}

	@Override
	public void visitFurniture(Furniture f) {
		System.out.println("should be covered with waterproof covers with an area of " + f.getLenght() + "x"
				+ f.getWidth());
	}

	@Override
	public void visitGlass(Glass g) {
		System.out.println("should be packed in a box with the dimensions " + (g.getLenght() + 1) + "x"
				+ (g.getWidth() + 1) + "x" + (g.getHeight() + 1) + " and filled with Bubble wraps");
	}

	@Override
	public void visitElectronic(Electronic e) {
		System.out.println(
				"should be covered with Polyethylene foam film and packed in a box with the dimensions "
						+ (e.getLenght() + 1) + "x" + (e.getWidth() + 1) + "x" + (e.getHeight() + 1));

	}

	public void getPackingInstructions(HouseholdItem i) {
		i.accept(this);
	}

}
