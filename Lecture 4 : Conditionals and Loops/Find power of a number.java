/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1 */ 

import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int pow = x;

        if(n==0)
        {
            System.out.print(1);    
        }else{
                    for(int i = 2; i<=n; i++)
                     {
                             pow = pow*x;
                     }

                     System.out.print(pow);
        }
       
    }
}
