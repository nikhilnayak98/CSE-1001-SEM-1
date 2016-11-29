import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To calculate smallest divisor.
 */
public class SmallestDivisor 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,sdivisor,r,d;
		System.out.println("Enter a number");
		n=sc.nextInt();
		if(n%2==0)
			sdivisor=2;
		else
		{
			r=(int) Math.sqrt(n);
			d=3;
			while((n%d!=0)&&(d<r))
				d+=2;
			if(n%d==0)
				sdivisor=d;
			else
				sdivisor=1;
		}
		System.out.println("Smallest Divisor is " + sdivisor);
	}
			
}
