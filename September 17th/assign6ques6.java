import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To print Fibonacci Series with an efficient algorithm.
 */
public class assign6ques6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=0;i<n/2;i++)
		{
			System.out.print(a + " " + b + " ");
			a=a+b;
			b=a+b;
		}
	}

}
