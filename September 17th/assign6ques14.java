import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To read a set of n single digits and converts them into a single decimal integer.
 */
public class assign6ques14 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,res=0,n,j;
		System.out.println("Enter the number of inputs :");
		n=sc.nextInt();
		j=n;
		for(int i=1;i<=n;i++)
		{
			num=sc.nextInt();
			if(j!=1)
				j--;
			else
				j=0;
			res+=num*(int)(Math.pow(10, j));
		}
		System.out.println("Number : " + res);
	}

}
