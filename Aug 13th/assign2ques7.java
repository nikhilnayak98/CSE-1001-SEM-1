import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To calculate the body mass index (BMI)
 */
public class assign2ques7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double weight,height,bmi;
        System.out.println("Enter Your Weight & Height");
        weight=sc.nextDouble();
        height=sc.nextDouble();
        bmi=weight/(height*height);
        System.out.println("BMI = " + bmi);
        
	}

}
