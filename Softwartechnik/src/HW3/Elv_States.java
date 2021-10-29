package HW3;

public class Elv_States {
	
	public  String current_State;
	
	public  String Idle = "Idle"; // state 0
	public  String Moving_up = "Moving_up"; // state 1
	public  String Moving_down = "Moving_down"; // state 2
	
	
	public Elv_States ()
	{
		current_State = Idle;
	
	}

}