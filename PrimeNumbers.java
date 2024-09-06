import java.util.Scanner;

    public class PrimeNumbers {
	public static void main(string[] args){

		Scanner inputCollector = new Scanner(System.in);
                 
            System.out.print(" enter a number ");
                 int userinput = inputcollector.nextInt();
                 int factor = 0;

              for(int i = 1; i <= userInput; i++){
                  if(userinput %i ==0) factors++;
           }
		
		    
	System.out.println(userInput + " has "	+ factors +  " factors " );
        System.out.printf("%s %s a prime number%n" , userInput,factors==2?"is":" is not");
		



}
}