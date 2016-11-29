import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To compute harmonic mean.
 */
public class assign5ques9 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,n,i;
		System.out.println("Enter value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum+=n/(1/(i*i));
		}
		System.out.println("Sum : " + sum);
	}

}
