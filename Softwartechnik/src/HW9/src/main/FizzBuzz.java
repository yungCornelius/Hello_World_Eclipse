package HW9.src.main;

public class FizzBuzz {
	
	public String convertNumber(int number) {
		if(number % 5 == 0 && number % 7 != 0) {
			return "Fizz";
		} else if(number % 5 != 0 && number % 7 == 0) {
			return "Buzz";
		} else if(number % 5 == 0 && number % 7 == 0) {
			return "FizzBuzz";
		} 
		
		return "BuzzFizz";
	}
}
