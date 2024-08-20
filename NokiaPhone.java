import java.util.Scanner;
   
public class NokiaPhone{
public static void main(String[]  args){
 
String menu = """

Phonebook menu

Phone Book

Messages

Chat

Call register

Tones

Settings

Call divert

Games

Calculator

Reminder

Clock

Profiles

SIM services

""";

System.out.println(menu);
Scanner input = new Scanner(System.in);

System.out.print("Select a button");
int value = input.nextInt();


switch(value){

case 1: System.out.print(" Phonebook menu");
System.out.print("Select a button");
int phonebook = input.nextInt();


switch(phonebook){

      case 1: System.out.print("Search"); break;
      case 2: System.out.print("Service Nos"); break;
      case 3: System.out.print("Add name"); break;
      case 4: System.out.print("Erase"); break;
      case 5: System.out.print("Edit"); break;
      case 6: System.out.print("Assign tone"); break;
      case 7: System.out.print("Send b'card"); break;
      case 8: System.out.print("Option");
      System.out.print("Select a button");
int options=input.nextInt();
        switch(options){
               case 1: System.out.print("Type of view"); break;
               case 2: System.out.print("Memory status"); break;
} break;

     case 9: System.out.print("Speed dials");break;
     case 10: System.out.print("Voice Tags");break;
} break;


case 2: System.out.print(" Messages");
System.out.print("Select a button");
int messages = input.nextInt();

       switch (messages){
          case 1: System.out.print("Write messages"); break;
          case 2: System.out.print("Inbox"); break;
          case 3: System.out.print("Outbox"); break;
          case 4: System.out.print("Picture messages"); break;
          case 5: System.out.print("Templates"); break;
          case 6: System.out.print("Smileys"); break;
          case 7: System.out.print("Messages settings");
 System.out.print("Select a button");
 int set1 = input.nextInt();
             switch(set1){
              case 1: System.out.print("Message centre number"); break;
              case 2: System.out.print(" Message sent as"); break;
              case 3: System.out.print("Message validity"); break;
}break;

          case 8: System.out.print("Info service");break;
          case 9: System.out.print("Voice mail number");break;
          case 10:System.out.print("Service command editor"),break;
}
}


case 3: System.out.print("Chat");break;

case 4: System.out.print("Call register")
System.out.print("Select a button");
int messages = input.nextInt();
    
      switch( call register){
          case 1: System.out.print("Missed calls"); break;
          case 2: System.out.print("Received calls"); break;
          case 3: System.out.print("Dialled numbers"); break;
          case 4: System.out.print("Erase recent call lists"); break;
          case 5: System.out.print("Show call duration"); break;

 System.out.print("Select a button");
 int set1 = input.nextInt();
             switch(set1){
              case 1: System.out.print("Last call duration"); break;
              case 2: System.out.print(" All calls' duration"); break;
              case 3: System.out.print("Received calls'duration"); break;
              case 4: System.out.print("Dialled calls' duration"); break;
              case 5: System.out.print(" All calls' duration"); break;
              case 6: System.out.print("Clear timers"); break;


}break;












}
}







