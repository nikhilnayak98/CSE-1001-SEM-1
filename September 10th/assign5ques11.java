import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To print out n values of the sequence.
 */
public class assign5ques11
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i,t=-1,p=1;
		System.out.println("Enter value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			p=(-1)*t;
			System.out.print(p+" ");
			t=p;
		}
	}

}
