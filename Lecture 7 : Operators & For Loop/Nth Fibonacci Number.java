/*Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) =  1, 
           F(2) = 1
           Now the number is ‘6’ so we have to find the “6th” Fibonacci number
So by using the property of the Fibonacci series i.e 

[ 1, 1, 2, 3, 5, 8, 13, 21]
So the “6th” element is “8” hence we get the output.
*/ 

import java.util.*;
public class Solution {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();

	int[] a;
	a = new int[200];
	a[0]= 1;
	a[1] = 1;
	if(n==1)
	{
		System.out.print(a[1]);
	}else{
				for(int i = 2; i<a.length; i++)
				{
					a[i]= a[i-1]+a[i-2];
				}
					System.out.print(a[n-1]);
				}
	}

	
}


