import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To calculate square root.
 */
public class Square
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int m;
		double root;
		System.out.println("Enter a number");
		m=sc.nextInt();
		root=sq_rt(m);
		System.out.println("Square root of that number = " + root);
	}
	
	public static double sq_rt(int m)
	{
		double error=0.00000001,g1,g2=m/2;
		do
		{
			g1=g2;
			g2=(g1+(m/g2))/2;
		}while(Math.abs(g1-g2)>error);
		return g2;
	}
}
