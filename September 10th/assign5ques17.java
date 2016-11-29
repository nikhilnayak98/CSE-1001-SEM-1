import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To find the largest factorial number present as factor in n.
 */
public class assign5ques17
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,j;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			if(n%i==0)
			{
				int temp=1;
				for(j=1;j<=i;j++)
				{
					temp*=j;
					if(temp==i)
					{
						System.out.println("Highest Factorial Number is " + i);
						System.exit(0);
					}
				}
			}
		}
	}

}
