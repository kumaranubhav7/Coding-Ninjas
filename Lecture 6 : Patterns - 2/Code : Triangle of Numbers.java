/*Print the following pattern for the given number of rows.
Pattern for N = 4
    1
   232
  34543
 4567654
*/ 

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i = 1;
		while(i<=n)
		{
			int spaces = 1;
			while(spaces<=n-i)
			{
				System.out.print(' ');
				spaces++;
			}

			int num = i;
			int j = 1;
			while(j<=i)
			{
				System.out.print(num);
				num++;
				j++;
			}

			int dec = i - 1;
			int half = num-2;
			while(dec>=1)
			{
				System.out.print(half);
				dec--;
				half--;
			}

			System.out.println("");
		i++;
		}
		
	}
}
