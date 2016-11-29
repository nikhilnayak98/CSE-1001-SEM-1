import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To exchange values without using fourth temporary variable.
 */
public class assign4ques3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter value of A ");
		a=sc.nextInt();
		System.out.println("Enter value of B ");
		b=sc.nextInt();
		System.out.println("Enter value of C ");
		c=sc.nextInt();
		System.out.println("Enter value of D ");
		d=sc.nextInt();
		d=a+b+c+d;
		c=d-(b+c+a);
		b=d-(b+c+a);
		a=d-(b+c+a);
		d=d-(b+c+a);
		System.out.println("Value of A : " + a);
		System.out.println("Value of B : " + b);
		System.out.println("Value of C : " + c);
		System.out.println("Value of D : " + d);
	}

}
