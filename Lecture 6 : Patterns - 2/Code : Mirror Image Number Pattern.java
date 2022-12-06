/*Print the following pattern for the given N number of rows.
Pattern for N = 4
     1
    12
   123 
  1234
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
			int p = 1;
			int spaces = 1;
			while(spaces<=n-i)
			{
				System.out.print(' ');
				spaces++;
			}
			int stars = 1;
			while(stars<=i)
			{
				System.out.print(p);
				stars++;
				p++;
			}
			System.out.println("");
			i++;
		}
		
	}

}
