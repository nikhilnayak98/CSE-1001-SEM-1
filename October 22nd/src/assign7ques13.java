/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To convert a character to integer.
 */
import java.util.Scanner;
public class assign7ques13 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int d,dec=0,i;
		String str;
		System.out.println("Enter a string");
		str=sc.next();
		for(i=0;i<str.length();i++)
		{
			d=str.charAt(i)-'0';
			dec=dec*10+d;
		}
		System.out.println("Converted number is " + dec);
	}

}
