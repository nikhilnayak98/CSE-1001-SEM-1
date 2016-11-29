import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To print a number is odd or even
 */
public class assign3ques3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=sc.nextInt();
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}

}
