import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Base conversion using method
 */
public class BaseConv 
{

	public static void main(String[] args) 
	{
		int r,n,base;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("Enter base");
		base=sc.nextInt();
		convert(n,base);
	}
	public static void convert(int n,int base)
	{
		int zero='0',i=0,ascii,r;
		char A[]=new char[20];
		while(n!=0)
		{
			r=n%base;
			ascii=zero+r;
			if(ascii>'9')
				ascii+=7;
			A[i]=(char)ascii;
			n/=base;
			i++;
		}
		i--;
		while(i>=0)
		{
			System.out.print(A[i]);
			i--;
		}
	}
}
