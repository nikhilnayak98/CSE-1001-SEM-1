import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To display name of generation
 */
public class assign3ques10 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter DOB Year");
		year=sc.nextInt();
		if((year>1966)&&(year<1980))
			System.out.println("Generation X & O");
		else if((year>1981)&&(year<1999))
			System.out.println("Generatin Y");
		else if((year>2000)&&(year<2012))
			System.out.println("Generation Z & K");
		

	}

}
