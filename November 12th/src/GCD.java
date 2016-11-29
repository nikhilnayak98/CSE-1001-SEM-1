import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To calculate GCD.
 */
public class GCD 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int gcd,r,n,m,temp;
		System.out.println("Enter first number");
		n=sc.nextInt();
		System.out.println("Enter second number");
		m=sc.nextInt();
		if(m>n)
		{
			temp=n;
			n=m;
			m=temp;
		}
		do
		{
			r=n%m;
			n=m;
			m=r;
		}while(r!=0);
		System.out.println("GCD is " + n);
	}

}
