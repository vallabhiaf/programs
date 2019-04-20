// Naive Solution to find if count 
// of divisors is even or odd 

import java.io.*; 
import java.math.*; 

class GFG 
{ 

	// Function to count 
	// the divisors 
	static void countDivisors(int n) 
	{ 
		// Initialize count 
		// of divisors 
		int count = 0; 

		// Note that this 
		// loop runs till 
		// square root 
		for (int i = 1; i <= Math.sqrt(n) + 1; i++) 
		{ 
			if (n % i == 0) 

				// If divisors are 
				// equal increment 
				// count by one 
				// Otherwise increment 
				// count by 2 
				count += (n / i == i) ? 1 : 2; 
		} 

		if (count % 2 == 0) 
			System.out.println("Even"); 

		else
			System.out.println("Odd"); 
	} 

	// Driver Code 
	public static void main(String args[]) 
	{ 
		System.out.print("The count of divisor: "); 
		countDivisors(10); 
	} 
} 
// This code is contributed by Nikita Tiwari 
