/*Write a program to print parallelogram pattern for the given N number of rows.
For N = 5
*****
 *****
  *****
   *****
    *****
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
			int spaces = 1;
			while(spaces<i)
			{
				System.out.print(' ');
				spaces++;
			}
			while(j<=n)
			{
				System.out.print('*');
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}
