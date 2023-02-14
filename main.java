
import java.util; 
import java.util.*;

public class main { 


public static void main (String [] args)  { 

System.out.println ("Hello, welcome to RPS, other wise known at Rock, Paper, Scissors. "); 
System.out.println ("Please choose one of the three, type in your answer and press enter. "); 
System.out.println ( "Your oppenent the computer will choose a random weapon and the results will be printed"); 


 
Scanner scanner = new Scanner(System.in); 
String userinput = scanner.nextLine();

String [] choose = {"rock", "paper", "scissors" }; 

boolean same = false; 

Random rn = new Random();
int answer = rn.nextInt(3);

for (String city:choose) { 
    if (city.equalsIgnoreCase(userinput)) {
        same = true;
        break;}   
    // 

    else System.out.println("not a valid move"); } 

String rs = choose[answer]; 

System.out.println("Your oppenent chose " + rs ); 

if (rs.equalsIgnoreCase(userinput)) { 


System.out.println("tie!"); 

}







}
}




