/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date : 13th November 2016, Sunday
 * Brief Description: Calculator functionalities - includes Addition, Subtract, Multiplication, Division, Square Root and Remainder.
 */

public class SimpleCalculator 
{

	SimpleCalculator() 
	{
		System.out.println("Created a Simple Calculator Object");
	}

	public int additionSimple(int x, int y)
	{
		return x+y;
	}

	public int subtractionSimple(int x, int y)
	{
		return y-x;
	}

	public int multiplicationSimple(int x, int y)
	{
		return x*y;
	}

	public int divisionSimple(int x, int y)
	{
		if(x!=0)
			return y/x;
		else
		{
			System.out.println("Divide by zero error");
			System.exit(0);
			return 0;
		}
	}

	public int remainderSimple(int n, int m)
	{
		return n%m;
	}

	public double squarerootSimple(int n)
	{
		if(n>0)
			return (Math.sqrt(n));
		else
		{
			System.out.println("Number should be positive");
			System.exit(0);
			return 0;
		}
	}

}
