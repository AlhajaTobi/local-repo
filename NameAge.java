import java.util.Scanner;

    public class NameAge {

    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("enter your firstName :");
    String firstName = scanner.nextLine();
    
    System.out.print("enter your lastName :");
    String lastName = scanner.nextLine();

    System.out.print("enter your age :");
    String age  = scanner.nextLine();
 
    System.out.printf("your name is %s %s and your age is %s", firstName, lastName, age);

}
}

