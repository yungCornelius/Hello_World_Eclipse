package HW6;

public class BetMoreGame {

	private Shuffle s;

	public BetMoreGame() {
		s = new Shuffle();
	}

	public int play() {
		return s.pickCard();
	}

}
