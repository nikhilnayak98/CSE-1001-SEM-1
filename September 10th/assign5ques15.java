import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To compute the x^n/n! of number.
 */
public class assign5ques15 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,fact=1,x=1;
		System.out.println("Enter number");
		n=sc.nextInt();
		while(n!=0)
		{
			fact=fact*n;
			n--;
		}
		x=(int)Math.pow(n,x);
		System.out.println("x^n/n! : " + (x/fact));
	}

}
