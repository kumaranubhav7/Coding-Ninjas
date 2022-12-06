/*Print the following pattern
Pattern for N = 4
    *
   ***
  *****
 *******
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

		int i = 1;
		while(i<=n)
		{
			int spaces= 1;
			while(spaces<=n-i)
			{
				System.out.print(' ');
				spaces++;
			}

			int stars=1;
			while(stars<=i)
			{
				System.out.print('*');
				stars++;
			}

			int dec = i-1;
			while(dec>=1)
			{
				System.out.print('*');
				dec--;
			}
			System.out.println("");
			i++;

		}
		
	}

}
