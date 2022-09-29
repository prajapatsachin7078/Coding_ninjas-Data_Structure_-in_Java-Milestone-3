package ConditionAndLoops;

import java.util.Scanner;

/*Write a program to calculate the total salary of a person.
    The user has to enter the basic salary (an integer) and the grade (an uppercase character), 
    and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
*/
public class totalSalary {
	public static void main(String[] args) {
		// Write your code here
         int basic;
    String str;
    char grade;
    Scanner sc = new Scanner(System.in);
   
    basic = sc.nextInt();
    str = sc.next();
    sc.close();
    grade = str.charAt(0);
    double hra,da,allow,pf,totalSalary;
    hra = (20.0*basic)/100.0;
    da = (50.0*basic)/100.0;
    pf = (11.0*basic)/100.0;
    if(grade=='A'){
        
        allow=1700.0;
        
    }
    else if(grade=='B'){
        allow=1500.0;
    }
    else{
        allow=1300.0;
    }
    totalSalary = Math.round((basic+hra+da+allow)-pf);
    System.out.println(Math.round(totalSalary));
	}
}
