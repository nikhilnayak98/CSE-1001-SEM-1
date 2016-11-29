import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To calculate sum using method
 */

public class type4 
{

	public static void main(String[] args) 
	{
		sum();
	}
	public static void sum()
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Sum =" + (a+b));
	}

}
