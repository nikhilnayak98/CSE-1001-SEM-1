import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To revese the number
 */
public class assignques4 
{

	public static void main(String[] args) 
	{
		double men,women,litmen,litwomen,illmen,illwomen,totalpop;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total population");
		totalpop=sc.nextDouble();
		men=(0.52*totalpop)*100;
		women=((1-0.52)*totalpop)*100;
		litmen=(0.35*totalpop);
		litwomen=((1-0.35)*totalpop);
		illmen=totalpop-litmen;
		illwomen=totalpop-litwomen;
		System.out.println("Illiterate Men = " + illmen + ",Illiterate Women = " + illwomen );	

	}

}
