/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date : 13th November 2016, Sunday
 * Brief Description: Calculator functionality to generate Fibonacci numbers.
 */
public class FibonacciNumber 
{

	FibonacciNumber() 
	{
		System.out.println("Created a FibonacciNumber Object");
	}
	public void printFibonacciNumbers(int n)
	{
		SimpleCalculator obj=new SimpleCalculator();
		int a=0,b=1,i=2;
		while(i<n)
		{
			System.out.print((a) + " " + (b) + " ");
			a=obj.additionSimple(a, b);
			b=obj.additionSimple(a, b);
			i=obj.additionSimple(i, 2);;
		}
		if(i==n)
		{
			System.out.print(a + " ");
			System.out.print(b + " ");
		}
		else
			System.out.print(a + " ");
	}

}
