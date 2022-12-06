/*Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.*/ 

import java.util.*;
public class Main {
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		int rem,num,print = 0;
		num = N;
		while(num!=0)
		{
			rem = num%10;
			num = num/10;
			print = print*10+rem;
		}

		System.out.print(print);
	}
}
