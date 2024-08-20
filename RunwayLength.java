import java .util.Scanner;
public class RunwayLength{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter value of speed");
double speed = input.nextDouble();

System.out.print("enterb acceleration");
double acceleration = input.nextDouble();


double MinRunwayLength = (speed*speed)/ (2*acceleration);
System.out.printf(" The minimum runway length for this airplane is %.3f ", MinRunwayLength);


}
}
