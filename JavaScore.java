import java .util.Scanner;
   public class JavaScore{  
   	public static void main(String[] args){
     	Scanner scanner = new Scanner(System.in);
     	int passed = 0;
     	int failed = 0;
     	
        System.out.println("Enter a number");
     	int score = scanner.nextInt();
    
     while(score != -1){

     if(score >= 60){
     System.out.println(" you pass the exam"); 
     }
     else{
     System.out.println("you dont pass the exam");

     }

     System.out.println("Enter a number");
     score = scanner.nextInt();
     


}

  
}


     

 

}

     

     

 
