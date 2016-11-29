/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To determine bulbs which are on and off .
 */
public class assign7ques7 
{

	public static void main(String[] args) 
	{
		int bulb[]=new int[500],pos,i,j;
		for(i=0;i<bulb.length;i++)
			bulb[i]=0;

		for(i=1;i<bulb.length;i++)
		{    
			pos=i+1;
			for(j=i;j<bulb.length;j+=pos)
			{
				if(bulb[j]==1)
					bulb[j]=0;
				else
					bulb[j]=1;
			}
		}
		System.out.println("Bulbs which are OFF are : ");
		for(i=0;i<=bulb.length;i++)
		{
			if(bulb[i]==0)
				System.out.print((i+1) + " ");
		}
	}

}
