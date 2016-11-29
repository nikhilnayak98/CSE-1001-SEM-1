/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date : 13th November 2016, Sunday
 * Brief Description: Calculator functionality to check Prime number.
 */
public class PrimeNumber 
{
	PrimeNumber() 
	{
		System.out.println("Created a PrimeNumber Object");
	}
	public boolean checkPrimeNumber(int y)
	{
		SimpleCalculator obj=new SimpleCalculator();
		int ctr=0;
		for(int i=1;i<=y;i++)
		{
			if(obj.remainderSimple(y,i)==0)
				ctr++;
		}
		if(ctr==2)
			return true;
		else 
			return false;
	}

}
