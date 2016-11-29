import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To generate the first n terms of the sequence without using multiplication.
 */
public class assign5ques10 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter value of n");
		n=sc.nextInt();
		for(i=1;i<n;i+=i)
		{
			System.out.print(i +" ");
		}

	}

}
