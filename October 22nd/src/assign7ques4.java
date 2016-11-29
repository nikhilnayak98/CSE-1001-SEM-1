import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To input 10 integers from the keyboard into an array. The number to be searched is entered through the keyboard by the user. Write a java program to find if the number to be searched is present in the array and if it is present, display the number of times it appears in the array.
 */
public class assign7ques4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[10];
		int ctr=0,num;
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter an interger");
			A[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched : ");
		num=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(A[i]==num)
			{
				ctr++;
			}
		}
		if(ctr>0)
			System.out.println("Total number of times " + num + " appears in the array : " + ctr);
		else
			System.out.println("Not present in the array.");
	}

}
