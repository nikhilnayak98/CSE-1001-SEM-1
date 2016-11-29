/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To print 5 integers per line from 1000 to 2000.
 */
public class assign4ques5 
{

	public static void main(String[] args) 
	{
		for(int i=1000;i<=2000;i++)
			if(i%10==5||i%10==0)
				System.out.print(i +"\n");
			else
				System.out.print(i+" ");
	}

}
