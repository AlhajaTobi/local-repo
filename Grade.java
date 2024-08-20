import java.util.Scanner;

     public class Grade{
     public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int passed = 0;
     int failed = 0;
     int counter= 1;

    
     while(counter <= 10){
     System.out.println("Enter a number");
     int score   =  scanner.nextInt ();
     counter++;
  
     if(score >=50){
     System.out.println("Pass"); 
     passed = passed + 1;

 }
     if(score < 50){
     System.out.println("Fail");
     failed = failed + 1;


}

  
}
 System.out.printf("Total passed %d%n", passed);
   System.out.printf("Total failed %d%n", failed);

     

 

}
}