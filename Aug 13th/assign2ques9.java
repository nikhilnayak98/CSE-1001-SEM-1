import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To calculate gross salary
 */
public class assign2ques9 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double salary,newsalary;
		System.out.println("Enter Salary");
		salary=sc.nextDouble();
		newsalary=salary+(salary*(0.4+0.20));
		System.out.println("Gross Salary = " + newsalary);
		

	}

}
