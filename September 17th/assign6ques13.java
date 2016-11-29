import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To count the sum of number of digits in an integer.
 */
public class assign6ques13 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,sum=0,r;
		System.out.println("Enter a number");
		num=sc.nextInt();
		while(num>0)
		{
			r=num%10;
			num/=10;
			sum+=r;
		}
		System.out.println("Sum of digits :" + sum);
	}

}
