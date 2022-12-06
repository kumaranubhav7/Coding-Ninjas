/*Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1 */ 

import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int p=n;
		int i = 1;
		while(i<=n)
		{
			int j = 1;
			while(j<=n-i+1)
			{
				System.out.print(p);
				j++;
			}
			System.out.println("");
			i++;
			p--;
		}
		
	}

}
