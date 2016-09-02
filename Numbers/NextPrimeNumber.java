package numbers;

import java.util.Scanner;

public class NextPrimeNumber {
	
	static boolean isPrime(int number) {
		for (int i = 2; i < number; i++)
			if (number % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		boolean done = false;
		int number = 2;
		while (!done) {
			System.out.println("Would you like to see the next prime number? Type yes or no.");
			String decide = input.nextLine();
			
			if (decide.toLowerCase().trim().equals("yes")) {
				String prime = "";
				while (prime.equals("")) {
					if (isPrime(number)) {
						prime +=number;
						System.out.println(number);
					}
					else 
						number++;
				}
			
				number++;
			}
			
			if (decide.toLowerCase().trim().equals("no")) {
				done = true;
				System.out.println("Good Bye.");
			}
				
		}
		

	}

}
