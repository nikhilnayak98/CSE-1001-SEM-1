import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To exchange values without using fourth temporary variable.
 */
public class assign5ques2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter value of A ");
		a=sc.nextInt();
		System.out.println("Enter value of B ");
		b=sc.nextInt();
		System.out.println("Enter value of C ");
		c=sc.nextInt();
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println("Value of A : " + a);
		System.out.println("Value of B : " + b);
		System.out.println("Value of C : " + c);
	}

}
