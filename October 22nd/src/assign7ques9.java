/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To  convert a decimal integer to its corresponding octal representation.
 */
import java.util.Scanner;
public class assign7ques9 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,oct,i=0,r,zero='0';
		char A[]=new char[20];
		System.out.println("Enter a number");
		num=sc.nextInt();
		while(num!=0)
		{
			r=num%8;
			oct=zero+r;
			A[i]=(char)oct;
			i++;
			num/=8;
		}
		i--;
		while(i>=0)
		{
			System.out.print(A[i]);
			i--;
		}
	}
	
}
