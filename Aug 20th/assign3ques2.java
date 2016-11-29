import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: Sum of digits in 5 digit number
 */
public class assign3ques2 
{

	public static void main(String[] args) 
	{
		int num,sum,d1,d2,d3,d4,d5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 5 digit number");
		num=sc.nextInt();
		d1=num/10000;
		d2=(num%10000)/1000;
		d3=((num%10000)%1000)/100;
		d4=(((num%10000)%1000)%100)/10;
		d5=(((num%10000)%1000)%100)%10;
	    sum=d1+d2+d3+d4+d5;
	    System.out.println("Sum = " + sum);

	}

}
