import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To check if all the three points fall on one straight line
 */
public class assign3ques5 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3;
		System.out.println("Enter coordinates (X1,Y1)");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.println("Enter coordinates (X2,Y2)");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		System.out.println("Enter coordinates (X3,Y3)");
		x3=sc.nextDouble();
		y3=sc.nextDouble();
		if(((y2-y1)/(x2-x1))==((y3-y2)/(x3-x2)))
			System.out.println("They are collinear");
		else
			System.out.println("Non Collinear");
		

	}

}
