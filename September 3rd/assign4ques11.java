import java.util.Scanner;
import java.lang.Math;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To print n uniform random values between 0 and 1, and then prints their average value
 */
public class assign4ques11 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double n,temp,i,sum=0,rand;
		System.out.println("Enter a number");
		n=sc.nextDouble();
		for (i=0;i <n;i++)
		{ 
			rand= Math.random(); 
			sum+=rand;
			System.out.println(rand);
		}
		System.out.println("Avg = " + sum/n);
	}
}
