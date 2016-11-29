import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To evaluate the function cos(x) as defined by the infinite series  expansion..
 */
public class assign6ques4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);     
		int sum=1,res,j,t=1,x;
		System.out.print("Enter a number: ");
		x=sc.nextInt();
		//x=(x*(Math.PI))/180;
		for (int i=0; i<=x; i+=2)
		{
			j=i;
			int fact=1;
			while(j!=0)
			{
				fact=fact*j;
				j--;
			}
			res=t*((int)(Math.pow(x,i))/fact);
			t=t*(-1);
			sum+=res;
		}
		System.out.print("The sum is: "+ sum);
	}
}