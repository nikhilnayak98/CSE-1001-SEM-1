/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date : 13th November 2016, Sunday
 * Brief Description: Calculator functionality to check Palindrome Number.
 */
public class Palindrome 
{
	Palindrome() 
	{
		System.out.println("Created a Palindrome Object");
	}
	public boolean checkPalindrome(int y)
	{
		SimpleCalculator obj=new SimpleCalculator();
		int temp=y,rev=0,r;
		while(y!=0)
		{
			r=obj.remainderSimple(y, 10);
			rev=obj.additionSimple(obj.multiplicationSimple(rev, 10),r);
			y=obj.divisionSimple(10, y);
		}
		if(temp==rev)
			return true;
		else
			return false;
	}

}
