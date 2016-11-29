import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: Simple calculator
 */
public class assignques8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double num1,num2,num3,result;
		System.out.println("Enter first number");
		num1=sc.nextDouble();
		System.out.println("Enter second number");
		num2=sc.nextDouble();
		System.out.println("Enter third number");
		num3=sc.nextDouble();
		result=(num1+num2+num3)/2;
		System.out.println("Result = " + result);

	}

}
