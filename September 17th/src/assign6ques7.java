import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To print Lucas Sequence.
 */
public class assign6ques7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,a=1,b=3;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(a + " " + b + " ");
			a=a+b;
			b=a+b;
		}
	}

}
