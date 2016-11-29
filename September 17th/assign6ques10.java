import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To generate the sequence where each member is the sum of the  adjacent factorials. .
 */
public class assign6ques10 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1,sum=1;
		System.out.println("Enter number ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sum=a+b;
			System.out.print(sum + " ");
			a=a+b;
			b=a+b;
		}
	}
}
