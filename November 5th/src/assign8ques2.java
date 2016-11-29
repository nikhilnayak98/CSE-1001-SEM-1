import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To calculate geometric mean(GM) using method
 */

public class assign8ques2 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		double nums[]=new double[50],gm;
		int n;
		System.out.println("Enter the number of inputs");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter number " + (i+1));
			nums[i]=sc.nextDouble();
		}
		gm=calc_gm(nums,n);
		System.out.println("Geometric Mean is " + gm);
	}
	public static double calc_gm(double nums[],int n)
	{
		double gm=1;
		for(int i=0;i<n;i++)
		{
			gm*=nums[i];
		}
		return (Math.pow(gm,(1/n)));
	}
}
