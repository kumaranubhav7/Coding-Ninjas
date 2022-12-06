/*Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)*/

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int choice = s.nextInt();

		int low = 1;
		int sum = 0;
		int product = 1;
		if(choice == 1)
		{
				for(int i = 1; i<=N; i++)
				{
					sum = sum + i;
				}
			System.out.print(sum);

		}else if(choice == 2)
		{
				for(int i = 1; i<=N; i++)
				{
					product = product * i;
				}
			System.out.print(product);

		}else{
			System.out.print(-1);
		}
	}
}
