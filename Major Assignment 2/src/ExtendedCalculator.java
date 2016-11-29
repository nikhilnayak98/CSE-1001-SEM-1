/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date : 13th November 2016, Sunday
 * Brief Description: Major Assignment 2 - Developing a calculator.
 */
import java.util.Scanner;

public class ExtendedCalculator 
{

	public static void main(String args[])
	{

		System.out.println("1: for Square");
		System.out.println("2: to check for Prime Number");
		System.out.println("3: to print Fibonacci Numbers");
		System.out.println("4: to Calculate the Euclidean Distance between Points");
		System.out.println("5: to Check for Palindrome");

		Scanner scanner = new Scanner(System.in);
		short input = scanner.nextShort();

		if (input == 1)
		{
			System.out.println("Enter a Number");
			int n=scanner.nextInt();
			CalculateSquare squareObject=new CalculateSquare();
			int squareValue=squareObject.calculateSquare(n);
			System.out.println("The Number Squared is " + squareValue);
		}
		else if (input == 2)
		{
			System.out.println("Enter a Number");
			int n=scanner.nextInt();
			PrimeNumber pnumObject=new PrimeNumber();
			boolean status=pnumObject.checkPrimeNumber(n);
			if(status==true)
				System.out.println("Yes it is a prime number");
			else
				System.out.println("Not a prime number");
		}

		else if (input == 3)
		{
			System.out.println("Enter number of fibonacci numbers to print");
			int n=scanner.nextInt();
			FibonacciNumber fiboObject=new FibonacciNumber();
			fiboObject.printFibonacciNumbers(n);
		}
		else if (input == 4)
		{
			System.out.print("Enter x1 : ");
			int x1=scanner.nextInt();
			System.out.print("Enter y1 : ");
			int y1=scanner.nextInt();
			System.out.print("Enter x2 : ");
			int x2=scanner.nextInt();
			System.out.print("Enter y2 : ");
			int y2=scanner.nextInt();
			EuclideanDistance eucObject=new EuclideanDistance();
			double distance=eucObject.calculateEuclideanDistance(x1, y1, x2, y2);
			System.out.println("\nDistance between those two point : " + distance + " units");
		}
		else if (input == 5)
		{
			System.out.println("Enter a number");
			int n=scanner.nextInt();
			Palindrome palObject=new Palindrome();
			boolean status=palObject.checkPalindrome(n);
			if(status==true)
				System.out.println("Yes it is a Palindrome number");
			else
				System.out.println("No it is not a Palindrome number");
		}
		else
		{
			System.out.println("Wrong Input");
		}
		scanner.close();
	}

}
