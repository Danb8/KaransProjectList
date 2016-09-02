package numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactorization {
	
	static boolean isPrime(int number) {
		boolean primeChecker = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0){
				primeChecker = false;
			}
			
		}
		return primeChecker;
	}

		


	

	public static void main(String[] args) {
		
		System.out.println("Enter an integer to discover its prime factors.");
		int prime = 3;
		Scanner input = new Scanner(System.in);
		
		boolean isValid = false;
		
		while (!isValid){
			try {
				prime = input.nextInt();
				isValid = true;
				}
			catch (InputMismatchException e) {
				System.out.println("Invalid. Please enter an integer.");
				input.next();
			}
		}
		
		String factors = "";
		
		
		
		for (int i = 2; i <= prime; i++) {
			if (isPrime(i)) {
				if (prime % i == 0) {
					factors += i + " ";
					System.out.println("i is " + i);
					System.out.println("prime is " + prime);
				}
			}
		}
		
		
		
	System.out.println("Prime factors are: " + factors);}

}
