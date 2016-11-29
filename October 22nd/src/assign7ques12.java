/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To convert decimal to BCD .
 */
import java.util.Scanner;
public class assign7ques12 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int decimal,digit;
		String BCD="";
		System.out.println("Enter a decimal number : ");
		decimal=sc.nextInt();
		while(decimal!=0)
		{
			digit=decimal%10;
			BCD=conv_bcd(digit) + " " + BCD;
			decimal/=10;
		}
		System.out.println("BCD is : " + BCD);
	}

	public static String conv_bcd(int digit)
	{
		String str="";
		for(int i=3;i>=0;i--)
		{
			int d=(int) Math.pow(2,i);
			if(digit/d!=0)
			{
				str+="1";
				digit-=d;
			}
			else
				str+="0";
		}
		return str;
	}

}
