 import java.util.Scanner;
 public class Converter{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in pounds:");
	double pounds = input.nextDouble();

	double convertedPounds = pounds*0.454;
	System.out.printf("%.1f pounds is %.3f kilogram", pounds, convertedPounds);








}

}


    






