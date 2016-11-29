import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To  find the sum of the first n terms of the series  f(s)=0!+1!+2!+3!+........+n!  (n>=0).
 */
public class assign6ques2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=1,i,j;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			j=i;
			int fact=1;
			while(j!=0)
			{
				fact=fact*j;
				j--;
			}
			sum+=fact;
		}
		System.out.println("Sum : " + sum);
	}

}
