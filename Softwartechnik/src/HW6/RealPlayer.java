package HW6;

import java.util.Scanner;

public class RealPlayer extends Player {

	public RealPlayer() {
		super();
	}

public void play() {

		boolean userSelected = false;

		int c = 1;
		
		while (userSelected == false) {
			
			num = GameChair.bet.play();

			Scanner scanner = new Scanner(System.in);

			System.out.println("deine karte ist: " + num);

			System.out.println("wenn du mit dieser karte fortfahren möchtest schreibe ja, wenn nicht tippe nein.");

			String ln = scanner.nextLine();
			
			if (ln.equals("ja") || c == 5) {
				userSelected = true;
				scanner.close();
			} 

			c++;
		}

	}

}
