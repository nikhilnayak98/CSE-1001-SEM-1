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
		int n,i=3,a=0,b=1,c=1;
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(i<n)
		{
			System.out.print(a + " " + b + " " + c + " ");
			a=a+b+c;
			b=a+b+c;
			c=a+b+c;
			i+=3;
		}
		if(i==n)
			System.out.print(a + " " + b + " " + c + " ");
		else if(i==(n-1))
			System.out.print(a + " " + b + " ");
		else
			System.out.print(a + " ");
	}

}
