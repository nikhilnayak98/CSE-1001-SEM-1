
/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To determine which bulbs are OFF
 */
public class assign4ques15 
{

	public static void main(String[] args) 
	{
		int A[]=new int[501];
		int i;
		for(i=1;i<=500;i++)
			A[i]=0;
		for(i=1;i<=500;i+=4)
		{
		for(i=2;i<=500;i+=2)
			A[i]=1;
		for(i=3;i<=500;i+=3)
			{
			 if(A[i]==0)
				 A[i]=1;
			 else
				 A[i]=0;
			}
		}	
		for(i=1;i<=500;i+=5)
		{
		for(i=2;i<=500;i+=2)
			A[i]=1;
		for(i=3;i<=500;i+=3)
			{
			 if(A[i]==0)
				 A[i]=1;
			 else
				 A[i]=0;
			}
		}	
		for(i=1;i<=500;i++)
			{
			if(A[i]==0)
				System.out.println("These bulbs are off " + i);
			}
	}

}
