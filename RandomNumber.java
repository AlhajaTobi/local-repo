import java.util.Random;
import java.util.Scanner;
   
	public class randomnumber {
	public static void(string[] args){
		
		int answer, guess;
		final int MAX = 99;

		Scanner input = new Scanner(System.in);
		Random rand new Random();

		answer = rand.nextInt(MAX); + 1;

		System.out.print("Guess a number between 0 and 99: ");
			guess = input,nextInt();

		if(guess < answer){
		System,out.println("Too low" + answer)
		}
		else{
		    System.out.println( "Too High") + answer);
		}
		



}
}

	