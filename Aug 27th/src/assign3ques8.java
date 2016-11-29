import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To calculate BMI
 */
public class assign3ques8
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double weight,height,bmi;
		System.out.println("Enter Height");
		height=sc.nextDouble();
		System.out.println("Enter Weight");
		weight=sc.nextDouble();
		bmi=weight/(height*height);
		if(bmi>=30.0)
			System.out.println("obese");
		else if((bmi>=25.0)&&(bmi<=29.9))
			System.out.println("overweight");
		else if((bmi>=18.5)&&(bmi<=24.9))
			System.out.println("normal weight");
		else
			System.out.println("underweight");
		
	}

}
