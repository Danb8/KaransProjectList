package numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeReturn {

	public static void main(String[] args) {
		
		double cost = 0;
		double payment = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the total cost.");
		boolean catcher = false;
		
		while (!catcher) {
			try {
				cost = input.nextDouble() * 100;
				catcher = true;
			}
			
			catch (InputMismatchException e) {
				System.out.println("Please enter the total cost.");
				input.next();
			}
		}
		catcher = false;
		System.out.println("Enter the amount paid.");
		while (!catcher) {
			try {
				payment = input.nextDouble() * 100;
				catcher = true;
			}
			
			catch (InputMismatchException e) {
				System.out.println("Please enter the total cost.");
				input.next();
			}
		}
		
		double change = (payment - cost);
		
		if (change < 0)
			System.out.println("You haven't paid enough to cover the cost!");
		
		if (change == 0)
			System.out.println("You have paid the exact amount, no change required.");
		
		
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		
		if (change > 0) {
			while (change >= 25) {
				change -= 25;
				quarters++;
			}
			while  (change >= 10) {
				change -= 10;
				dimes++;
			}
			while  (change >= 5) {
				change -= 5;
				nickels++;
			}
			while  (change >= 1) {
				change -= 1;
				pennies++;
			}
			
		}
		System.out.println("Your change is " + quarters + " quarters " + dimes + " dimes " + nickels + " nickels " + pennies + " pennies.");
	}

}
