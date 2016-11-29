import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To determine the quadrant
 */
public class assign3ques7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter X coordinate");
		x=sc.nextInt();
		System.out.println("Enter Y coordinate");
		y=sc.nextInt();
		if((x>0)&&(y>0))
			System.out.println("("+x+","+y+") is in "+"I Quadrant");
		else if((x<0)&&(y>0))
			System.out.println("("+x+","+y+") is in "+"II Quadrant");
		else if((x<0)&&(y<0))
			System.out.println("("+x+","+y+") is in "+"III Quadrant");
		else if((x>0)&&(y<0))
			System.out.println("("+x+","+y+") is in "+"IV Quadrant");
		else
			System.out.println("("+x+","+y+") is in "+"origin");

	}

}
