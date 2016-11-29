import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To swap two numbers without using third variable
 */
public class assign2ques4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a & b resp");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = " + a + "b = " + b);
	}

}
