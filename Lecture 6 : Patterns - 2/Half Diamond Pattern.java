/*Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.
*
*1*
*121*
*12321*
*121*
*1*
*
    */

import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int n1 = N+1;
        int n2 = N;
        int i = 1;
        int loop = -1;
        while(i<=n1) //First Half of the Pattern
        {
            System.out.print('*');
            int j = 1;
            int print = 1;
            int k = i;
            if(i!=1)
            {
                while(j<=loop)
                {

                    System.out.print(print);
                    if (print == k - 1) {
                        print--;
                        k--;
                    } else {
                        print++;
                    }
                    j++;
                }
            }

            //For the last print value
            if(i==1)
            {
                System.out.print(' ');
            }else{
                System.out.print('*');
            }
            System.out.println("");
            i++;
            loop=loop+2;
        }
        
        // Second Half of the pattern
         i = 1;
         loop = loop - 4;
          int l = n2;
          if(N == 0)
          {
              System.out.print('*');
          }
        while(i<=n2)
        {
            System.out.print('*');
            int j = 1;
            int print = 1;
            int m = l;
            if(i!=n2)
            {
                     while(j<=loop)
                    {
                         System.out.print(print);
                         if(print == m-1)
                         {
                             print--;
                             m--;
                         }else{
                                    print++;
                         }
                          j++;
                    }
            }      
            //For the last Print value
             if(i==n2)
            {
                System.out.print(' ');
            }else{
                System.out.print('*');
            }
            System.out.println("");
            i++;
            loop = loop-2;
            l=l-1;
        }

    }
}
