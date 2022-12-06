/*Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE */ 

import java.util.*;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i = 1;
		int u = n;
		while (i <= n) {
			int j = 1;
			char p = (char) ('A' + u - i);
			while (j <= i) {
				System.out.print(p);
				p = (char) (p + 1);
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}
