package HW3;

public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	arrive_atFloor();


	}

	private void arrive_atFloor() {
		if(dest_Floor < current_Floor) {
			current_Floor--;
			State.current_State = State.Moving_down;
			System.out.println("State: " + State.current_State + "; current floor: " + current_Floor);
			arrive_atFloor();
		} else if(dest_Floor > current_Floor) {
			current_Floor++;
			State.current_State = State.Moving_up;
			System.out.println("State: " + State.current_State + "; current floor: " + current_Floor);
			arrive_atFloor();
		} else {
			State.current_State = State.Idle;
			System.out.println("We arrived the Destination floor: " + current_Floor);
		}
	}

	
}
