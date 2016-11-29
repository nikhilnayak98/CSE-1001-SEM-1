import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To print the multiplication table of a number entered by the user.
 */
public class assign4ques8 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. for which you want to find the multiplication table: ");
		num=sc.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(num +"X" + i + "=" + (num*i));
	}

}
