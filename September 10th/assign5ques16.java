import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To  determine whether or not a number n is a factorial number.
 */
public class assign5ques16 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,temp=1,flag=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
		  temp*=i;
		  if(temp==n)
		   {
			  flag=1;
		      break;
		   }
		}
		if(flag==1)
			System.out.println("Is a Factorial");
		else
			System.out.println("Not a Factorial");
	}

}
