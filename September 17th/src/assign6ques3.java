import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To compute e =e=1/0! +1/1! +1/2! +1/3!..... + upto n terms.
 */

public class assign6ques3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=1;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			int j=i;
			int fact=1;
			while(j!=0)
			{
				fact*=j;
				j--;
			}
			sum+=1/fact;
		}
		System.out.println("Sum : " + sum);

	}

}
