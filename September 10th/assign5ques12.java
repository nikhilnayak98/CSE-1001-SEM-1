import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To compute the sum of the first n terms (n>=1) of the series
 */
public class assign5ques12 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,t=-1,p,n,i,j;
		System.out.println("Enter value of n");
		n=sc.nextInt();
		for(j=0,i=1;j<n;i=i+2,j++)
		{
				p=(-1)*t;
				sum=sum+(p*i);
				System.out.println(p*i);
				t=p;
		}
		System.out.println("Sum : " + sum);
	}

}
