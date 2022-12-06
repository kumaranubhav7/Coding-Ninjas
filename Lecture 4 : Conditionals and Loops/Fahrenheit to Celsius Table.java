/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.*/ 

import java.util.*;		
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
		int S = s.nextInt(); //Start Value
		int E = s.nextInt(); // End Value
		int W = s.nextInt(); //Step Size
		
		int com=S;
		while(com<= E)
		{
			int temp = 0;
			temp=(int)((com-32)*0.5556);
			System.out.println(com+" "+temp);
			com=com+W;
		}
		
	}

}
