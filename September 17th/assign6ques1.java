import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To evaluate the function sin(x) as defined by the infinite series  expansion..
 */
public class assign6ques1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);     
		int sum=0,res,i,j,k,t=1,x;
		System.out.print("Enter a number: ");
		x=sc.nextInt();
		//x=(x*(Math.PI))/180;
		for (i=1,k=1;k<=x;i+=2,k++)
		{
			j=i;
			int fact=1;
			while(j!=0)
			{
				fact=fact*j;
				j--;
			}
			res=t*((int)(Math.pow(x,i))/fact);
			sum+=res;
			t=t*(-1);
		}
		System.out.print("The sum is: "+ sum);
	}
}