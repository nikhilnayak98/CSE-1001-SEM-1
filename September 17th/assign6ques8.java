import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To print some sequence.
 */
public class assign6ques8 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1,c=1;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(a + " " + b + " " + c + " ");
			a=a+b+c;
			b=a+b+c;
			c=a+b+c;
		}
	}

}
