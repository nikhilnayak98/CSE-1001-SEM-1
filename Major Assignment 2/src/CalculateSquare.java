/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date : 13th November 2016, Sunday
 * Brief Description: Calculator functionality to calculate square.
 */
public class CalculateSquare
{

	CalculateSquare() 
	{		
		System.out.println("Created a Calculate Square Object");
	}

	public int calculateSquare(int y)
	{
		SimpleCalculator object = new SimpleCalculator();
		int square = object.multiplicationSimple(y, y);
		return square;
	}
}
