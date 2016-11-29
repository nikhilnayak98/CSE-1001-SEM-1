import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To display personal info
 */
public class assign3ques12 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String fname,lname;
		char gender,marstatus;
		int age;
		System.out.print("What is your gender (M or F)?:");
		gender=sc.next().charAt(0);
		System.out.print("First Name:");
		fname=sc.next();
		System.out.print("Last Name:");
		lname=sc.next();
		System.out.print("Age:");
		age=sc.nextInt();
		if(((gender=='F')||gender=='f')&&(age>20))
		{
			System.out.print("Are you married," + fname + "(y or n)?:");
		    marstatus=sc.next().charAt(0);
		    if(marstatus=='y')
		    	System.out.println("Then I shall call you Mrs. " + fname + " " + lname + ".");
		    else
		    	System.out.println("Then I shall call you Ms. " + fname + " " + lname + ".");
		}
		else if((gender=='M')||(gender=='m'))
			{
			 if(age>20)
				 System.out.println("Then I shall call you Mr. " + fname + " " + lname + ".");
			 else
				 System.out.println("Then I shall call you " + fname + " " + lname + ".");
			}
			

	}

}
