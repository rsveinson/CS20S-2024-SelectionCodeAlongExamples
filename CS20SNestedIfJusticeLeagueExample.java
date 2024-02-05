import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     CS20SNestedIfJusticeLeagueExample
 * 
 *  Description:    an example of nested if-else and 
 *                  the application of the four principle
 *                  of nested design
 * 
 *************************************************************/

public class CS20SNestedIfJusticeLeagueExample {

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

        // app variables
        // input items
        int age = 0;
        int months = 0;     // number of months of membership

        char membershipType = 'a';
        char trainingType = 'a';

        // ***** objects *****

        //Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Nested If Justice League Example" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);

        // ***** Get Input *****

        prompt = "Enter your age and months of membership" + nl;
        prompt += "Enter L for a limited membership, F for full." + nl;
        prompt += "Enter D for devo program, E for elite, or X for no program." + nl;
        strin = JOptionPane.showInputDialog(banner + prompt);

        // echo input
        System.out.println("You entered " + strin);

        // parse input and catch input errors
        tokens = strin.split(delim);
        try{
            age = Integer.parseInt(tokens[0]);
            months = Integer.parseInt(tokens[1]);
            membershipType = tokens[2].charAt(0);
            trainingType = tokens[3].charAt(0);            
        }// end try
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, banner + "Missing items in input.");
        }// end catch array index out of bounds
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, banner + "Invalid data type entered.");
        }// end catch number format excpetion
        
        
        // ***** Main Processing *****

        // independent variable is age
        // one of these things doesn't belong is junior
        // 1st principle put junior in if
        // dry tbd

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");

    } // end main 

} // end FormatTemplate
