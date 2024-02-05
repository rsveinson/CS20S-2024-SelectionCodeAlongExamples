import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

/* ****************************************
 * Name:        Sveinson
 * Class:       CS20S
 * 
 * Assignment:  a simple example implementing
 *              an if-else structure to print
 *              a message to the screen saying
 *              that a person is old enough to vote
 *              or not
 **********************************************/
public class CS20SVotingExample001{
    public static void main(String[] args){
    // **** Constants ****
    
        final String nl = System.lineSeparator();
    
    // **** variables ****
    
        String banner = "";         // output banner
        String prompt = "";         // prompt for input
        
        String strin = "";          // intput
        String strout = "";         // used for formatted output
        
        // class variables
        int age = 0;            // persons age
        String message = "";    // voting message
    
    // **** Objects ****
        // create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // **** banner ****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Voting Age Example" + nl;
        banner += "******************************";
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
        prompt = "Enter you age.";
        System.out.println(prompt);
        age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
        System.out.println();
    
    // **** processing ****
    
        if(age >= 18){
            //System.out.println("18 and over");
            message = "old enough";
            //System.out.println("You are " + message + " to vote");
        }// end if
        else{
            //System.out.println("under 18");
            message = "not old enough";
            //System.out.println("You are " + message + " to vote");
        }// end else
        
        // the DRY principle
        System.out.println("You are " + message + " to vote");
    
    // **** output ****
    
    // **** closing message ****
    
        System.out.println();
        System.out.println("end of program");
        
    }// end main

}// end class
