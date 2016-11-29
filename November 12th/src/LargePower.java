import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To raise a number to large power.
 */
public class LargePower 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x,n,prod,pseq;
		System.out.println("Enter base");
		x=sc.nextInt();
		System.out.println("Enter power");
		n=sc.nextInt();
		prod=1;
		pseq=x;
		while(n>0)
		{
			if(n%2==1)
				prod*=pseq;
			pseq*=pseq;
			n/=2;
		}
		System.out.println("Product is " + prod);
	}

}
