import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To convert km to metres,feet,inches and centimetres
 */
public class assign2ques6 
{

	public static void main(String[] args) 
	{
		double distinkm,distinmetres,distininch,distincenti,distinfeet;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Distance in KMs between 2 cities");
		distinkm=sc.nextDouble();
		distinmetres=distinkm*1000;
		distinfeet=3.2808*distinmetres;
		distininch=39.3701*distinmetres;
		distincenti=100*distinmetres;
		System.out.println("Distance in metres = " + distinmetres + " in feet = " + distinfeet + " in inches = " + distininch + " in centimetres = " + distincenti);
	}

}
