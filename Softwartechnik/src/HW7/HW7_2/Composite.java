package HW7.HW7_2;

import java.util.ArrayList;

public class Composite implements Component {

	private ArrayList<Component> subTeams = new ArrayList<Component>();
	public String name;

	public Composite(String pName) {
		name = pName;
	}

	@Override
	public void print() {
		System.out.println(name + ":");
		
		java.util.Iterator<Component> i = subTeams.iterator();

		while (i.hasNext()) {
			i.next().print();
		}
		System.out.println("");

	}

	public void add(Component c) {
		subTeams.add(c);
	}

	public void remove(Component c) {
		subTeams.remove(c);
	}

	public ArrayList<Component> getSubTeams() {
		return subTeams;
	}

}
