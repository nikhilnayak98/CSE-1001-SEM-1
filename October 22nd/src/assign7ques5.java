import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To insert an element at specific position of an array.
 */
public class assign7ques5 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[10];
		int pos;
		System.out.println("Enter position where number to be inserted");
		pos=sc.nextInt();
		System.out.println("Enter a number");
		A[pos]=sc.nextInt();
	}

}
