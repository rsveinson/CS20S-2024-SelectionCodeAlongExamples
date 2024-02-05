import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/* ****************************************
 * Name:        Sveinson
 * Class:       CS20S
 * 
 * Assignment:  Getting char data from the keyboard
 **********************************************/
public class CS20SMoreAdvancedInput{

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ,/:]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // app specific

        char ch1 = 'a';     // first char
        char ch2 = 'b';     // second char
        char ch3 = 'c';     // third char

        int n = 0;          // int from keyboard

        // ***** objects *****

        Scanner scanner = new Scanner(System.in);

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Getting Char Data" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****

        prompt = "enter a word and an int.";
        System.out.println(prompt);

        // get all of the input at once
        strin = scanner.nextLine();

        // echo input back to console window
        System.out.println(strin);

        // ***** Main Processing *****

        // parse the intput string
        // "ole  123 1"

        // split the input string into tokens
        tokens = strin.split(delim);
        // "ole" "123" "1"

        // parse each token
        ch1 = tokens[0].charAt(0);      // get the first letter
        ch2 = tokens[0].charAt(1);      // get the second letter
        ch3 = tokens[0].charAt(2);      // get the second lette

        n = Integer.parseInt(tokens[1]);    // parse the int

        // lab 5Q2
        prompt = "enter a letter";
        System.out.println(prompt);

        strin = scanner.next();

        // "a"
        ch1 = strin.charAt(0);

        // ***** Print Formatted Output *****
        // ***** Closing Message *****
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
