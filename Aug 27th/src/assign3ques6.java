import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To determine the youngest of the three
 */
public class assign3ques6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age1,age2,age3;
		System.out.println("Enter Age 1");
		age1=sc.nextInt();
		System.out.println("Enter Age 2");
		age2=sc.nextInt();
		System.out.println("Enter Age 3");
		age3=sc.nextInt();
		if((age1<age2)&&(age1<age3))
			System.out.println("Age 1 is youngest");
		else if((age2<age1)&&(age2<age3))
			System.out.println("Age 2 is youngest");
		else if((age3<age2)&&(age3<age1))
			System.out.println("Age 3 is youngest");
		else
			System.out.println("All are of equal age");
	}

}
