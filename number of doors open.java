/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        long n=sc.nextLong();
	        long p=(long)Math.sqrt(n);
	        System.out.println(p);
	    }}
}
