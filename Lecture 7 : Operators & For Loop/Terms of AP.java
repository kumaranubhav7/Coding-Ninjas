/*Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41*/ 

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s  = new Scanner(System.in);
		int N=s.nextInt();
        int i,res;
        int num=1,sum=0;
        while(sum<N)
        {
            res=3*num+2;
            if(res%4!=0)
            {
                System.out.print(res+" ");
                sum++;
            }
        num++;
        }
	}
}
