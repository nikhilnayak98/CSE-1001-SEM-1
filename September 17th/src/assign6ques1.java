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
		double i=1,t_sin,term,x,error=0.00001;
		System.out.print("Enter a number: ");
		x=sc.nextDouble();
		term=x;
		t_sin=x;
		while(Math.abs(term)>error)
		{
			i+=2;
			term=((x*x)/(i*(i-1)))*(-1)*term;
			t_sin+=term;
		}
		System.out.println("The sum is: "+ t_sin);
		System.out.println(Math.sin(x));
	}
}