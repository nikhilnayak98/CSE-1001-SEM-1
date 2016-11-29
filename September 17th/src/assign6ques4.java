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
		double i=0,t_cos=1,term,x,error=0.0000001;
		System.out.print("Enter a number: ");
		x=sc.nextDouble();
		term=x;
		while(Math.abs(term)>error)
		{
			i+=2;
			term=((x*x)/(i*(i-1)))*(-1)*term;
			t_cos+=term;
		}
		System.out.println("The sum is: "+ t_cos);
		System.out.println(Math.cos(x));
	}
}