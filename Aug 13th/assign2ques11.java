import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To calculate area of rectangle and circle
 */
public class assign2ques11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double length,breadth,radius,peri,circumf,recarea,cirarea;
		System.out.println("Enter Lenght & Breadth of rectangle");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
		peri=2*(length+breadth);
		recarea=length*breadth;
		System.out.println("Enter raduis of circle");
		radius=sc.nextDouble();
		circumf=2*radius*3.14;
		cirarea=3.14*radius*radius;
		System.out.println("perimeter of rectangle = " + peri + " and area = " + recarea);
		System.out.println("Circumference of circle = " + circumf + "Area = " + cirarea);	

	}

}
