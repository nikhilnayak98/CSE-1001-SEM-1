import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To print a student is pass or fail
 */
public class assign3ques2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double marks;
		System.out.println("Enter marks");
		marks=sc.nextDouble();
		if(marks>=40)
			System.out.println("Congratulation! You have passed in the exam.");
		else
			System.out.println("Sorry! You have failed in the exam.");
	}

}
