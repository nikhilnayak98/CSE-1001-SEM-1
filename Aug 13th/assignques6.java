import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To display details of a person
 */
public class assignques6 {

	public static void main(String[] args) 
	{
		int age;
		double height,weight;
		Scanner sc=new Scanner(System.in);
		System.out.println("Age of a person");
		age=sc.nextInt();
		System.out.println("Weight of a person");
		weight=sc.nextDouble();
		System.out.println("Height of a person");
		height=sc.nextDouble();
		System.out.println("So, you're " + age + " years old, " + height + " tall and " + weight + "KG heavy.");
		
		
	}

}
