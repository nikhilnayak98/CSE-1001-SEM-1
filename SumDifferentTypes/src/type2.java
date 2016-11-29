import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To calculate sum using method
 */

public class type2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		sum(a,b);
	}
	public static void sum(int a,int b)
	{
		System.out.println("Sum = " + (a+b));
	}

}
