package numbers;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Find_pi_to_the_nth_digit {

	public static void main(String[] args) {
		Double pi = Math.PI;

		String piString = pi.toString();
		int N = 0;
		String result = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Finding pi to the Nth decimal place. Please enter an integer N between 1 and 15.");
		
		boolean isValid = false;
		while (!isValid){
			try {
				N = input.nextInt();
				if (N >= 1 && N <= 15)
					isValid = true;
				else
					System.out.println("Not valid. Please enter an integer between 1 and 15.");
				
			}
		
			catch(InputMismatchException e) {
				System.out.println("Not valid. Please enter an integer between 1 and 15.");
				input.next();
			}
		}
		
		
		
		for (int i = 0; i <= N + 1; i++) {
			result += piString.charAt(i);

		}
		
		System.out.println(result);
	}

}
