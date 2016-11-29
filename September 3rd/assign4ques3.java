import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To print x from -2 to 2, counting by 0.5
 */
public class assign4ques3 
{

	public static void main(String[] args) 
	{

		int fnum,tnum,bnum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Count from :");
		fnum=sc.nextInt();
		System.out.print("Count to :");
		tnum=sc.nextInt();
		System.out.print("Count by :");
		bnum=sc.nextInt();
		for(int i=fnum;i<=tnum;i+=bnum)
			System.out.print(i + " ");

	}

}
