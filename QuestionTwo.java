import java.util.Scanner;
public class QuestionTwo{

  public static void main(String[] args){
  Scanner userInput = new Scanner(System.in);
 System.out.print("input your integer");
 int intergerInput = userInput.nextInt();


if(intergerInput % 4  == 0 && intergerInput % 5 == 0){
	System.out.print(intergerInput +"is divisible by 4 & 5");
}
else{
	System.out.print(intergerInput + "is not divisible by 4 & 5");
}

}
}
		






	