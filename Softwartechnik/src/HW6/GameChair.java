package HW6;

public class GameChair {

	private Player computer;
	private RealPlayer player2;
	public static BetMoreGame bet;

	
	public GameChair() {
		computer = new Player();
		player2 = new RealPlayer();
		bet = new BetMoreGame();
	}

	public void start() {
		computer.play();
		player2.play();
		Player winner = findWinner(computer,player2);
		if(winner == computer) {
			System.out.println("der computer hat gewonnen.");

		} else if(winner == player2) {
			System.out.println("du hast gewonnen.");

		} else {
			System.out.println("niemand hat gewonnen.");

		}
	}

	public Player findWinner(Player p1, Player p2) {
		if (p1.getNum() > p2.getNum()) {
			return p1;
		} else if (p1.getNum() < p2.getNum()) {
			return p2;
		}
		return null;
	}
	

}
