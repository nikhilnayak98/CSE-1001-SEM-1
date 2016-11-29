import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To delete an element from specific position of an array. .
 */
public class assign7ques6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[5];
		int pos,temp;
		for(int i=0;i<A.length;i++)
			A[i]=sc.nextInt();
		System.out.println("\nEnter position to be deleted : ");
		pos=sc.nextInt();
		if(pos<=A.length)
		{
			for(int i=pos-1;i<A.length-1;i++)
				A[i]=A[i+1];
			A[A.length-1]=0;
		}
		else
			System.out.println("Invalid input");
	}

}
