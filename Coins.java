package change.com.coins;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * @author Phani kumar
 *
 */
public class ChangeTendered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test comment added

		    DecimalFormat decimalFormat = new DecimalFormat("0.00");

		    Scanner kb = new Scanner(System.in);
		    System.out.print("How much does this item cose? -> ");
		    double cost = kb.nextDouble();
		    System.out.print("How many will be purcased? -> ");
		    double quanity = kb.nextDouble();
		    double subtotal = (cost * quanity);
		    double tax = (subtotal * .06);
		    double total = (subtotal + tax);
		    System.out.print("How much money has been tendered? -> ");
		    double tendered = kb.nextDouble();
		            double change = (tendered - total);

		        int dollars = (int)change;
		        int twenties = dollars / 20;
		        int dollars1 = dollars % 20;
		        int tens = dollars1 / 10;
		        int dollars2 = dollars % 10;
		        int fives = dollars2 / 5;
		        int dollars3 = dollars % 5;
		        int ones = dollars3;

		        String moneyString = decimalFormat.format(change);
		        String changeString = Double.toString(change); 
		        String[] parts = moneyString.split("\\.");
		        String part2 = parts[1]; 
		        double cents5 = Double.parseDouble(part2);

		        int cents = (int)cents5;
		        int quarters = cents / 25;
		        int cents1 = cents % 25;
		        int dimes = cents1 / 10;
		        int cents2 = cents % 10;
		        int nickels = cents2 / 5;
		        int cents3 = cents % 5;
		        int pennies = cents3;

		        System.out.println("Cost: " + "$" + decimalFormat.format(cost));
		        System.out.println("Quanity: " + quanity);
		        System.out.println("Subtotal: " + "$" + decimalFormat.format(subtotal));
		        System.out.println("Tax: " + "$" + decimalFormat.format(tax));
		        System.out.println("Total: " + "$" + decimalFormat.format(total));
		        System.out.println("Tendered: " + "$" + decimalFormat.format(tendered));
		        System.out.println("Change: " + "$" + moneyString);


		        System.out.println(twenties + " Twenties");
		        System.out.println(tens + " Tens");
		        System.out.println(fives + " Fives");
		        System.out.println(ones + " Ones");
		        System.out.println(quarters + " Quarters");
		        System.out.println(dimes + " Dimes");
		        System.out.println(nickels + " Nickels");
		        System.out.println(pennies + " Pennies");

		  }
		
}
