import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To calc percentage and aggregate
 */
public class assign3ques7 
{

	public static void main(String[] args) 
	{
		double maths,phy,chem,compsc,engl,per,agg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks in physics");
		phy=sc.nextDouble();
		System.out.println("Enter marks in chemistry");
		chem=sc.nextDouble();
		System.out.println("Enter marks in maths");
		maths=sc.nextDouble();
		System.out.println("Enter marks in compsc");
		compsc=sc.nextDouble();
		System.out.println("Enter marks in english");
		engl=sc.nextDouble();
		agg=(phy+chem+maths+compsc+engl)/5;
		per=(agg/500)*100;
		System.out.println("Aggregate Marks = " + agg + " , Percentage = " + per);
		
	}

}
