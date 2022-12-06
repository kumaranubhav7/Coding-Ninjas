/*Print the following pattern for the given number of rows.
Note: N is always odd.
Pattern for N = 5
    *
   ***
  *****
   ***
    *
*/ 

import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int n1 = (N+1)/2;
        int n2 = N/2;
        int i = 1;
        while(i<=n1)
        {
           int spaces = 1;
           while(spaces<=n1-i)
           {
               System.out.print(' ');
               spaces++;
           }

           int stars = 1;
           while(stars<=2*i-1)
           {
               System.out.print('*');
               stars++;
           }
           System.out.println("");
           i++;
        }
        
        int j =1;
        int k = n2;
        while(j<=n2)
        {
            int spaces = 1;
            while(spaces<=n2- k+1)
            {
                System.out.print(' ');
                spaces++;
            }
            int stars = 1;
            while (stars <= 2 * k - 1) {
                System.out.print('*');
                stars++;
            }
            System.out.println("");
            j++;
            k--;
        }

    }
}
