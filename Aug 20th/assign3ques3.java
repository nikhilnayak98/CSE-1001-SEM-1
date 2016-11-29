import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To revese the number
 */
public class assign3ques3 
{

	public static void main(String[] args)
	{
		int num,newnum,d1,d2,d3,d4,d5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 5 digit number");
		num=sc.nextInt();
		d1=num/10000;
		d2=(num%10000)/1000;
		d3=((num%10000)%1000)/100;
		d4=(((num%10000)%1000)%100)/10;
		d5=(((num%10000)%1000)%100)%10;
	    newnum=(d5*10000)+(d4*1000)+(d3*100)+(d2*10)+d1;
	    System.out.println("Reversed Number = " + newnum);
	}

}
