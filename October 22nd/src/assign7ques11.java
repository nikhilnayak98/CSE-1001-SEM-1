/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To convert a binary number to octal.
 */
import java.util.Scanner;
public class assign7ques11 
{

	public static void main(String args[])
	{
		int binnum,r,i=0,j,octnum[]=new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary Number : ");
		binnum=sc.nextInt();
		while(binnum!=0)
		{
			r=binnum%1000;
			octnum[i]=conv_oct(r);
			binnum/=1000;
			i++;
		}
		i--;
		System.out.println("Converted Octal Number : ");
		while(i>=0)
		{
			System.out.print(octnum[i]);
			i--;
		}
	}
	
	public static int conv_oct(int r)
	{
		int temp,num=0,i=0;
		while(r!=0)
		{
			temp=r%10;
			num+=temp*(int)Math.pow(2, i);
			r/=10;
			i++;
		}
		return num;
	}

}
