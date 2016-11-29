import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To print Fibonacci Series.
 */
public class assign6ques5 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,temp,a=0,b=1,c;
		System.out.println("Enter number");
		n=sc.nextInt();
		System.out.print("0 1 ");
		for(int i=0;i<n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
