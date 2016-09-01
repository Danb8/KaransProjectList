package numbers;

import java.util.InputMismatchException;
import java.util.Scanner;



public class FibonacciSequence {
	
	static long Fib(long N){
		long j = 1;
		long a = 1;
		long b = 1;
		for (int i = 1; i <= N; i++) {
			if (i == 1 || i ==2)
				j = 1;
			else{
			j = a + b;
			a = b;
			b = j;
			}
			
			}
		return j;
	}
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		long i = 0;
		boolean isValid = false;
		
		System.out.println("Calculate the Fibonacci sequence to integer N. Please enter a number N between 1 and 92.");
		
		while (!isValid) {
			try {
				i = input.nextInt();
				if (i > 0 && i < 93)
					isValid = true;
				else 
					System.out.println("Please enter a positive integer between 1 and 92.");
				
			}
			
			catch (InputMismatchException e){
				System.out.println("Please enter a positive integer between 1 and 92.");
				input.next();
			}
		}
		for (int j = 1; j <= i; j++)
		System.out.print(Fib(j) + " ");
		

	}

}
