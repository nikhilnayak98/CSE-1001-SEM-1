import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To calculate total money from coins
 */
public class assign2ques12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tpaisa,fpaisa,rupees;
		double totalmoney;
		System.out.println("Enter the number of 25 paisa coins");
		tpaisa=sc.nextInt();
		System.out.println("Enter the number of 50 paisa coins");
		fpaisa=sc.nextInt();
		System.out.println("Enter the number of 1 rupee coins");
		rupees=sc.nextInt();
		totalmoney=((tpaisa*1/4)+(fpaisa*1/2)+rupees);
		System.out.println("Total Money = " + totalmoney);
	}

}
