// Java program for Efficient 
// Solution to find if count of 
// divisors is even or odd 
import java.io.*; 
import java.math.*; 

class GFG 
{ 

	// Function to find if count 
	// of divisors is even or 
	// odd 
	static void countDivisors(int n) 
	{ 
		int root_n = (int)(Math.sqrt(n)); 

		// If n is a perfect square, 
		// then, it has odd divisors 
		if (root_n * root_n == n) 
			System.out.println("Odd"); 

		else
			System.out.println("Even"); 
	} 

	// Driver code 
	public static void main(String args[]) 
		throws IOException 
	{ 
		System.out.print("The count of" + 
					"divisors of 10 is: "); 

		countDivisors(10); 
	} 
} 

// This code is contributed by Nikita Tiwari 
