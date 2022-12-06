/*Given a binary number as an integer N, convert it into decimal and print.
Sample Input 1 :
1100
Sample Output 1 :
12*/ 

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		int num = N, rem, binary = 0, i=0, power;
		while(num!=0)
		{
			rem = num%10;
			num = num/10;
			power = (int)Math.pow(2, i);
			binary = binary + rem*power; 
			i++;
		}

		System.out.println(binary);
	}
}
