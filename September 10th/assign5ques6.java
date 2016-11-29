import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To count negative and positive numbers.
 */
public class assign5ques6
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[10],i,neg=0,pos=0;
		for(i=0;i<10;i++)
		{
			if(A[i]<0)
				neg++;
			else
				pos++;
		}
		System.out.println("Total Negative Integers : " + neg);
		System.out.println("Total Positive Integers : " + pos);
	}

}
