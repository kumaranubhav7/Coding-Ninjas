/*Write a program to print all the factors of a number other than 1 and the number itself.*/ 

import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i =2;
        for(int j =2; j<n; j++)
        {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
            i++;
        }
        
    }
}
