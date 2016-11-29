import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To print number of passed students
 */
public class assign5ques4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=10,pass=0,fail=0,i;
		int stud[]=new int[30];
		for(i=0;i<n;i++)
		{
			stud[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(stud[i]>40)
				pass++;
			else
				fail++;
		}
		System.out.println("Total Students Passed : " + pass);
	}

}
