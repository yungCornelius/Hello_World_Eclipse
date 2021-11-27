package HW7.HW7_2;

public class Client {

	public static void main(String[] args) {
		Composite root = new Composite("Olympics Teams");
		Composite asia = new Composite("Asia");
		Composite europe = new Composite("Europe");
		Composite china = new Composite("China");
		Composite germany = new Composite("Germany");
		Composite womenCh = new Composite("Women's Team China");
		Composite menCh = new Composite("Men's Team China");
		Composite womenGer = new Composite("Women's Team Germany");
		Composite menGer = new Composite("Men's Team Germany");

		OlympicsTeam teakwondo = new OlympicsTeam("Teakwondo", 1, 1);
		OlympicsTeam waterpolo = new OlympicsTeam("Waterpolo", 2, 2);
		OlympicsTeam artGym = new OlympicsTeam("Artistic Gymnastics", 3, 3);
		OlympicsTeam shooting = new OlympicsTeam("Shooting", 4, 4);
		OlympicsTeam cycling = new OlympicsTeam("Cycling", 5, 5);
		OlympicsTeam tennis = new OlympicsTeam("Tennis", 6, 6);
		OlympicsTeam tabTennis = new OlympicsTeam("Table Tennis", 7, 7);
		OlympicsTeam football = new OlympicsTeam("Football", 8, 8);

		root.add(asia);
		root.add(europe);
		
		asia.add(china);
		
		china.add(womenCh);
		china.add(menCh);
		
		europe.add(germany);
		
		germany.add(womenGer);
		germany.add(menGer);
		
		womenCh.add(teakwondo);
		womenCh.add(waterpolo);
		womenCh.add(artGym);
		
		menCh.add(shooting);
		
		womenGer.add(cycling);
		womenGer.add(tennis);
		
		menGer.add(tabTennis);
		menGer.add(football);
		
		
		root.print();
	}

}
