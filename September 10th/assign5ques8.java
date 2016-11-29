import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To compute the sum of the square of n numbers..
 */
public class assign5ques8 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,n,i;
		System.out.println("Enter value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum+=(i*i);
		}
		System.out.println("Sum : " + sum);
	}

}
