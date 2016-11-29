import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To input 10 integers from keyboard and store them into an array and find number positive,negative,even,odd and sum.
 */
public class assign7ques1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[10];
		int pos=0,neg=0,sum=0,odd=0,even=0;
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter an integer");
			A[i]=sc.nextInt();
			if(A[i]<0)
				neg++;
			else
				pos++;
			if(A[i]%2==0)
				even++;
			else
				odd++;
			sum+=A[i];
		}
		System.out.println("Negative Integers : " + neg);
		System.out.println("Positive Integers : " + pos);
		System.out.println("Even Integers : " + even);
		System.out.println("Odd Integers : " + odd);
		System.out.println("Sum :" + sum);
	}

}
