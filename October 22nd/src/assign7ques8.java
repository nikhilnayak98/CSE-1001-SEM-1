/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To determine bulbs which are on and off .
 */
import java.util.Scanner;
import java.io.*;
public class assign7ques8 
{

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(new File("Quiz.dat"));
		String A[]=new String[20];
		int i=0,j,k;
		while(sc.hasNextLine())
		{
			A[i]=sc.nextLine();
			i++;
		}
		
		for(j=1;j<i;j++)
		{
			int ctr1=0,ctr2=0;
			for(k=0;k<A[0].length();k++)
			{
				if(A[0].charAt(k)==A[j].charAt(k))
					ctr1++;
				else
					ctr2++;
			}
			System.out.print(A[j] + "  " + ctr1 + "  " + ctr2);
			System.out.println();
		}

	}

}
