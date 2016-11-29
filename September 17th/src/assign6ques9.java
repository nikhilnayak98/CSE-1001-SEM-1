import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To check 2 numbers are fibonacci included in fibonacci series.
 */
public class assign6ques9 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,flag=0;
		System.out.println("Enter A");
		a=sc.nextInt();
		System.out.println("Enter B");
		b=sc.nextInt();
		for(int i=a;i>=0;i--)
		{
			b=a-b;
			a=a-b;
			if(a==0)
				flag=1;
		}
		if(flag==1)
			System.out.println("Yes they are consecutive fibonacci numbers");
		else
			System.out.println("NOT Consecutive");
	}

}
