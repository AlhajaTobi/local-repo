
public class DisplayPattern {

 public static void main (String[] args) {
  displayPattern(3); //

  }

public static void displayPattern(int n) {
   for (int i = 1; i <= n; i++) {
  
     for (int j =0; j < n-i; j++) {
     System.out.print(" ");

  }

 for(int k = 1; k <= i; k++) {
    System.out.print(k + " ");
 }

  System.out.println();


   }


   }
  }