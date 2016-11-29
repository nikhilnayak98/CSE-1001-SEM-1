import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To swap two numbers
 */
public class assign2ques3 {

	public static void main(String[] args) 
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		System.out.println("x = " + x + " y = " + y);
		z=x;
		y=x;
		x=z;
		System.out.println("x = " + x + " y = " + y);
	}

}
