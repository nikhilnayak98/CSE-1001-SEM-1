import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To count the number of digits in an integer.
 */
public class assign6ques12 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,a=0;
		System.out.println("Enter a number");
		num=sc.nextInt();
		if(num<0)
			num*=-1;
		else if(num==0)
			num=1;
		while(num>0)
		{
			num/=10;
			a++;
		}
		System.out.println("Total number of digits : " + a);
	}

}
