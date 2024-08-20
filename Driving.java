 import java.util.Scanner;
 public class Energy{

 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.print("enter the value for amount of water in kilograms" );
 double Amount = input.nextDouble();

 System.out.print("enter the value of initial temperature" );
 double Initial = input.nextDouble();

 System.out.print("enter the value for final temperature" );
 double Final = input.nextdouble();


  double FinalInitial =  Final - Initial;
  double FinalAmount =  FinalInitial * Amount;
 
  double Energetic  = FinalAmount * 4184;
  System.out.printf("the energy needed is: %f",Energetic);
 






}

}


    






