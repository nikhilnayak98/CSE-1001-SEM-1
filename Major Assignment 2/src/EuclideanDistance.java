/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date : 13th November 2016, Sunday
 * Brief Description: Calculator functionality to calculate Euclidean Distance.
 */
public class EuclideanDistance 
{
	EuclideanDistance() 
	{
		System.out.println("Created a EuclideanDistance Object");
	}
	public double calculateEuclideanDistance(int x1, int y1, int x2, int y2)
	{
		SimpleCalculator obj1=new SimpleCalculator();
		CalculateSquare obj2=new CalculateSquare();
		double distance=obj1.squarerootSimple(obj1.additionSimple(obj2.calculateSquare(obj1.subtractionSimple(x2, x1)),obj2.calculateSquare(obj1.subtractionSimple(y2, y1))));
		return distance;
	}
}
