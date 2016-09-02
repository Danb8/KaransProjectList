package numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CostOfTile {

	public static void main(String[] args) {
		
		float width = 0;
		float length = 0;
		float cost = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of your floor in feet?");
		boolean w = false;
		while (!w){
		
		try {
			width = input.nextFloat();
			w = true;
		}
		
		catch (InputMismatchException e) {
			System.out.println("Please enter the width in feet.");
			input.next();
		}
		}
		
		w = false;
		System.out.println("What is the length of your floor in feet?");
		while (!w) {
		
		try {
			length = input.nextFloat();
			w = true;
		}
		
		catch (InputMismatchException e) {
			System.out.println("Please enter the length in feet.");
			input.next();
		}
		}
		
		
		w= false;
		System.out.println("What is cost per square foot of tile?");
		while (!w) {
		
		try {
			cost = input.nextFloat();
			w = true;
		}
		
		catch (InputMismatchException e) {
			System.out.println("Please enter the cost of tile per square foot.");
			input.next();
		}
		}
		
		 float total = width * length * cost;
		 System.out.println("The cost of tile will be $" + total);
	}

}
