import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To reverse the digits in an integer.
 */
public class assign6ques11 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,rev=0,r;
		System.out.println("Enter a number");
		num=sc.nextInt();
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num/=10;
		}
		System.out.println("Reversed Number : " + rev);
	}

}
