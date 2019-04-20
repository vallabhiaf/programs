// C++ program for 
// Efficient Solution to find 
// if count of divisors is 
// even or odd 
#include <bits/stdc++.h> 
using namespace std; 

// Function to find if count 
// of divisors is even or 
// odd 
void countDivisors(int n) 
{ 
	int root_n = sqrt(n); 

	// If n is a perfect square, 
	// then it has odd divisors 
	if (root_n * root_n == n) 
		printf("Odd\n"); 
	else
		printf("Even\n"); 
} 

// Driver Code 
int main() 
{ 
	cout << "The count of divisors"
		<< " of 10 is: "; 

	countDivisors(10); 
	return 0; 
} 
