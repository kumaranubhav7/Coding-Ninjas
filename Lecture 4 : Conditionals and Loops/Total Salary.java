/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic. */ 

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		char ch = s.next().charAt(0);
		
		double totalSalary, hra, da,allow,pf;
		hra =(0.20*basic);
		da = (0.50*basic);
		pf = (0.11*basic);

		if(ch=='A')
		{
			allow=1700;
			totalSalary = (basic+hra+da+allow)-pf;
			System.out.println(Math.round(totalSalary));
		}
		else if(ch == 'B'){
			allow=1500;
			totalSalary = (basic+hra+da+allow)-pf;
			System.out.println(Math.round(totalSalary));
		}
		else{
			allow=1300;
			totalSalary = (basic+hra+da+allow)-pf;
			System.out.println(Math.round(totalSalary));
		}

	}
}
