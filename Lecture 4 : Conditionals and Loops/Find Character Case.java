/*Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet */ 

import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        if(c>='A' && c<='Z')
        {
            System.out.println("1");
        }else if(c>='a' && c<='z')
        {
            System.out.println("0");
        }else{
            System.out.println("-1");
        }

    }
}
