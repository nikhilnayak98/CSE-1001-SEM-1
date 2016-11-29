import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To convert character to number.
 */
public class NumberConv 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str;
		int d,i,converted;
		System.out.println("Enter a string");
		str=sc.next();
		conv(str);
	}

	public static void conv(String str)
	{
		int dec=0,d;
		for(int i=0;i<str.length();i++)
		{
			d=str.charAt(i)-'0';
			dec=dec*10+d;
		}
		System.out.println(dec);
	}
}
