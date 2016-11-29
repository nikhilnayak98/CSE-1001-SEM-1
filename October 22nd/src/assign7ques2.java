import java.io.*;
import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc:  To read 10 double values from a file named as “salary.txt” and store them into an array and find the maximum and minimum salary of the array.
 */
public class assign7ques2 
{

	public static void main(String[] args) throws IOException
	{
		Scanner fileIn = new Scanner(new File("salary.txt"));
		double A[]=new double[10],max=0,min=0;
		int i=0,j;
		while(fileIn.hasNext())
		{
			A[i]=fileIn.nextDouble();
			i++;
		}
		max=A[0];
		min=A[0];
		for(j=1;j<A.length-1;j++)
		{
			if(A[j]>max)
				max=A[j];
			if(A[j]<min)
				min=A[j];
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}

}
