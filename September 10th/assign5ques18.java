import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To  simulate multiplication by addition.
 */
public class assign5ques18 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,num1,num2,res=0;
		System.out.print("Enter Number 1 :");
		num1=sc.nextInt();
		System.out.print("Enter Number 2 :");
		num2=sc.nextInt();
		while(res!=num1*num2)
		{
			res+=num1;
		}
		System.out.println(num1 + " X " + num2 + " = " + res);
	}

}
