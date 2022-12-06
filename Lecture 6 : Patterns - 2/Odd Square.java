/* Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
*/ 

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i = 1;
		while(i<=n)
		{
			int j = 1;
			int curVal = 2*i - 1; 
			while(j<=n)
			{
				System.out.print(curVal);
				curVal = curVal + 2;

				int maxVal = 2*n-1;
				if(curVal > maxVal)
				{
					curVal = 1;
				}
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}
