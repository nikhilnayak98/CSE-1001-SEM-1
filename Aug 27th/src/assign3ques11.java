import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To determine the type of triangle
 */
public class assign3ques11 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int side1,side2,side3,ctr=0;
		System.out.println("Enter Side 1");
		side1=sc.nextInt();
		System.out.println("Enter Side 2");
		side2=sc.nextInt();
		System.out.println("Enter Side 3");
		side3=sc.nextInt();
		if(side1==side2)
			ctr++;
		if(side1==side3)
			ctr++;
		if(side2==side3)
			ctr++;
		if(ctr==0)
			System.out.println("Irregular");
		else if(ctr==1)
			System.out.println("Symmetric");
		else
			System.out.println("Regular");

	}

}
