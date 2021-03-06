package change.com.coins;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * @author Phani kumar
 *
 */public class CountChange {
      
       /*  This program will add up the value of a number of quarters,
           dimes, nickles, and pennies.  The number of each type of 
           coin is input by the user.  The total value is reported
           in dollars.  This program depends on the non-standard class,
           TextIO.
       */
    
       public static void main(String[] args) {
       
          int quarters;   // Number of quarters, to be input by the user.
          int dimes;      // Number of dimes, to be input by the user.
          int nickles;    // Number of nickles, to be input by the user.
          int pennies;    // Number of pennies, to be input by the user.
          
          double dollars; // Total value of all the coins, in dollars.
          
          /* Ask the user for the number of each type of coin. */
          
          TextIO.put("Enter the number of quarters:  ");
          quarters = TextIO.getlnInt();
          
          TextIO.put("Enter the number of dimes:     ");
          dimes = TextIO.getlnInt();
          
          TextIO.put("Enter the number of nickles:   ");
          nickles = TextIO.getlnInt();
          
          TextIO.put("Enter the number of pennies:   ");
          pennies = TextIO.getlnInt();
          
          /* Add up the values of the coins, in dollars. */
          
          dollars = (0.25 * quarters) + (0.10 * dimes) 
                              + (0.05 * nickles) + (0.01 * pennies); 
          
          /* Report the result back to the user. */
          
          TextIO.putln();
          TextIO.putln("The total in dollars is $" + dollars);
       
       }  // end main()

    }  // end class