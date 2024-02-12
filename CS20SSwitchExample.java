import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS20S
 * 
 *  Assignment:     Switch Example
 * 
 *  Description:    A simple example of a switch statement
 * 
 *************************************************************/

public class CS20SSwitchExample {

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // some variables for this example
        String grade;               // letter grade
        double gpa = 0.0;           // gpa equivalent

        // ***** objects *****

        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Switch Example" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);

        // ***** Get Input *****

        // prompt for input
        prompt = "enter your letter grade.";
        System.out.println(prompt);

        // read input from keyboard
        grade = scanner.next();

        // echo input back to console window
        System.out.println("you entered " + grade);

        // ***** Main Processing *****
        switch(grade){
            case "A":  gpa = 4.0;
                break;
            case "B":   gpa = 3.0;
                // could have more statements
                break;
            case "C":   gpa = 2.0;
                break;
            case "D":   gpa = 1.0;
                break;
            case "F":   gpa = 0.0;
                break;
            default:    System.out.println("Invalid grade entered");
        }// end switch

        // ***** Print Formatted Output *****

        System.out.println("Your grade " + grade + "-----> " + gpa);

        // ***** Closing Message *****
        System.out.println();
        System.out.println("end of processing");

    } // end main 

} // end FormatTemplate
