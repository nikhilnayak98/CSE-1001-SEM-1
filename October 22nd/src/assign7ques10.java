/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To convert a binary number to decimal.
 */
import java.util.Scanner;
public class assign7ques10 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int dig[]=new int[30],i=0,n,dec=0;
		System.out.println("Enter number of digits");
		n=sc.nextInt();
		System.out.println("Enter binary digits");
		while(i<n)
		{
			dig[i]=sc.nextInt();
			i++;
		}
		i--;
		while(i>=0)
		{
			dec+=(int) (dig[i]*Math.pow(2, i));
			i--;
		}
		System.out.println("Decimal Number = " + dec);
	}

}
