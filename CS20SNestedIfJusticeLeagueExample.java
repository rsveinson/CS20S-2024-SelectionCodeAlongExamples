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

        final int JUNIOR_AGE = 18;      // cut off for Junior members
        final int SENIOR_AGE = 55;      // cut off for Adult and senior members

        // monthly fees
        final double JUNIOR_FEE = 11.95; 
        final double ADULT_FEE = 19.95;
        final double SENIOR_FEE = 12.90;

        // service monthly fee
        final double DEVELOPMENT_FEE = 3.0;
        final double ELITE_FEE = 5.0;
        final double NO_FEE = 0.0;

        // percentage discout for limited membership
        final double DISCOUNT_PCT = 0.1;    

        // constant service codes
        // training program codes
        final char ELITE_CODE = 'E';        // elite
        final char DEVELOPMENT_CODE = 'D';  //development
        final char NO_PROGRAM_CODE = 'X';   // no program

        // membership codes for senior and adult
        final char LIMITED_CODE = 'L';
        final char FULL_CODE = 'F';

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
        
        // for calculations
        double monthlyFee = 0.0;        // monthly membership fee
        double monthlyCost = 0.0;       // total monthly bill for the member
        double trainingCost = 0.0;
        double discountAmount = 0.0;

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

        /* try to do these instuctions
         * if an error occurs catch it,
         * print a message and exit the 
         * program gracefully
         */
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
        // age is the primary nested if-else structure
        // training program and limited memberships are nested 
        // withing age
        // one of these things doesn't belong is junior
        // 1st principle put junior in if
        // dry tbd

        /*
         * 23 11 F X
         * 60 11 L X
         * 15 10 F X
         * 15 10 F E
         * 15 10 F D
         * 
         */
        if(age < JUNIOR_AGE){
            // discount is 0
            discountAmount = NO_FEE;
            
            // junior membership fee
            monthlyFee = months * JUNIOR_FEE;
            
            //System.out.println("junior");
            // development program logic

            if(trainingType == NO_PROGRAM_CODE){
                //System.out.println("no program");
                trainingCost = NO_FEE;
            }// end of no progam
            else{
                //System.out.println("program");
                if(trainingType == ELITE_CODE){
                    //System.out.println("elite");
                    trainingCost = months * ELITE_FEE;
                }// end elite
                else{
                    //System.out.println("dev");
                    trainingCost = months * DEVELOPMENT_FEE;
                }// end development
            }// end of program purchased
            
            // test program calculations
            //System.out.println("training fee = " + trainingCost);
            //System.out.println("monthly fee = " + monthlyFee);
        }// end junior
        else{
            //System.out.println("not junior");
            // training fee = 0;
            trainingCost = NO_FEE;
            
            // adult or senior
            if(age >= SENIOR_AGE){
                //System.out.println("senior"); 
                monthlyFee = months * SENIOR_FEE;
            }// end senior
            else{
                //System.out.println("adult");
                monthlyFee = months * ADULT_FEE;
            }// end adult

            // compute membership discount
            if(membershipType == FULL_CODE){
                //System.out.println("full");
                discountAmount = 0;
            }// end full member
            else{
                //System.out.println("limited");
                discountAmount = monthlyFee * DISCOUNT_PCT;
            }// end limited member
            
            // testing calculations for A and S
            System.out.println("monthly fee = " + monthlyFee);
        }// end not junior
        
        // calculate the total monthly bill
        monthlyCost = monthlyFee + trainingCost - discountAmount;
        
        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");

    } // end main 

} // end FormatTemplate
