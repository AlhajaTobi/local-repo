import java.util.Scanner;
public class Number4{

  public static void main(String[] args){
  Scanner userInput = new Scanner(System.in);
 System.out.print("input your integer");
 int intergerInput = userInput.nextInt();


if(Intergerinput %4 == 0){
System.out.print(intergerInput +"is divisible by 4");
}
else{
System.out.print(intergerInput + "is not divisible by 4");
}

}
}