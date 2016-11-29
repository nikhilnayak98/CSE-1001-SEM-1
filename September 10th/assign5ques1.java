import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To exchange values using fourth temporary variable.
 */

public class assign5ques1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,temp;
		System.out.println("Enter value of A ");
		a=sc.nextInt();
		System.out.println("Enter value of B ");
		b=sc.nextInt();
		System.out.println("Enter value of C ");
		c=sc.nextInt();
		temp=a;
		a=b;
		b=c;
		c=a;
		System.out.println("Value of A : " + a);
		System.out.println("Value of B : " + b);
		System.out.println("Value of C : " + c);
	}

}
