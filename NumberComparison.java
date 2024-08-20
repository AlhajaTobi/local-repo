import java.util.Scanner;
public class NumberComparison{
	public static void main(String[] args){
   		Scanner input = new Scanner(System.in);
   			System.out.print("Enter number one: ");
   			double numberOne = input.nextDouble();

   			System.out.print("Enter number two: ");
   			double numberTwo = input.nextDouble();

				if(numberOne > numberTwo) {
					System.out.printf("%s is greater", "Number one");

				} else {
					System.out.printf("%s is not greater", "Number two");

				}
              				if( numberOne == numberTwo){
					System.out.print("\nNumber one is equal to number two");
				}

					else {
					System.out.print("\n number two is not equal to number one ");}


}
}









   
















   

