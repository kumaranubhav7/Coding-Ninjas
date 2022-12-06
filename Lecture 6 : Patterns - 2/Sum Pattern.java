/*Write a program to print triangle of user defined integers sum.
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
*/ 

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i = 1;
		int sum = 0;
		while(i<=n)
		{
			sum = sum + i;
			int j = 1;
			while(j<=i)
			{
				System.out.print(j);
				if(j==i)
				{
					System.out.print('=');
				}else{
					System.out.print('+');
				}
				j++;
			}

			System.out.print(sum);
			System.out.println("");
			i++;
		}
	}
}
