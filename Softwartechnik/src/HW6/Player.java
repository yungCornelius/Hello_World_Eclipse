package HW6;

public class Player {

	protected int num;
	
	public Player() {
		num = 0;
	}
	
	public void play() {
		num = GameChair.bet.play();
	}
	
	public int getNum() {
		return num;
	}
	
}
