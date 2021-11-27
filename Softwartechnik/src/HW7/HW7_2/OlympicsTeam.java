package HW7.HW7_2;

public class OlympicsTeam implements Component {

	public String name;
	public int nOA;
	public int nOGM;
	
	public OlympicsTeam(String pName, int pNA, int pNM) {
		name = pName;
		nOA = pNA;
		nOGM = pNM;
	}

	@Override
	public void print() {
		System.out.println("Team: "+ name + ", Athletes: "+ nOA + ", Gold: "+ nOGM);
	}
	
}
