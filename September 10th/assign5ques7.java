import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To add numbers and return the resultant sum and compute the average.
 */
public class assign5ques7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[20],sum=0,avg,n,i;
		System.out.println("Enter value of n");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
			sum+=A[i];
		avg=sum/n;
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + avg);
	}

}
