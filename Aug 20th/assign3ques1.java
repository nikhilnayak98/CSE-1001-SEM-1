import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To find sum of first and last digit of 4 digit number
 */
public class assign3ques1 
{

	public static void main(String[] args) 
	{
		int num,fdig,ldig,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 4 digit number");
		num=sc.nextInt();
		fdig=num%10;
		ldig=num/1000;
		sum=fdig+ldig;
		System.out.println("Sum = " + sum);	

	}

}
