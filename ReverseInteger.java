import java.util.Scanner;

public class ReverseInteger {
  
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

 System.out.print("Enter an interger:  ");
 int number = input.nextInt();


reverse(number);

}

 public static void reverse(int number) {
 
  while (number!= 0) {
  int digit = number % 10;
  System.out.print(digit);
  number /= 10;

     }
System.out.println();



}

}