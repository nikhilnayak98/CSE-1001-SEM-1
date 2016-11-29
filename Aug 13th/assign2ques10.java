import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To convert Fahrenheit to Centigrade
 */
public class assign2ques10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double fahr,cel;
		System.out.println("Enter temperature in fahrenheit");
		fahr=sc.nextDouble();
		cel=(fahr-32)*5/9;
		System.out.println("Temperature in centigrade = " + cel);
	}

}
