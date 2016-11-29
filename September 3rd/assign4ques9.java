import java.lang.Math;
/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: to find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class assign4ques9 
{

	public static void main(String[] args) 
	{
		System.out.println("The sum of the squares of the first ten natural numbers is,");
		int sum1=0,sum2=0;
		for(int i=1;i<=100;i++)
			{
			 System.out.print((Math.pow(i,2)) + "+");
			 sum1+=i*i;
			}
		 System.out.print("=" + sum1);  
		System.out.println("The square of the sum of the first ten natural numbers is,");
		for(int j=1;j<=100;j++)
		{
			System.out.print(j + "+");
			sum2+=j;
		}
		System.out.print("=" + sum2);
		System.out.println("\nHence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is" + (sum2-sum1));
	}

}
