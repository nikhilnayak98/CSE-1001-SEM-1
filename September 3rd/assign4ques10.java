import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To input an integer, n, between 1 and 9 and print a line of output consisting of ascending digits from 1 to n, followed by descending digits from n-1 to 1.
 */
public class assign4ques10 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number(between 1 to 9)");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.print(i);
		for(int j=n-1;j>=1;j--)
			System.out.print(j);
	}

}
