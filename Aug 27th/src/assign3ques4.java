import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To determine whether the character is a capital letter, a small case letter, a digit or a special symbol
 */
public class assign3ques4
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		if((ch>=65)&&(ch<=90))
			System.out.println("Capital letter");
		else if((ch>=97)&&(ch<=122))
			System.out.println("Small letter");
		else if((ch>=48)&&(ch<=57))
			System.out.println("Number");
		else
			System.out.println("Special Symbol");
	}

}
