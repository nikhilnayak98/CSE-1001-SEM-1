import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc:  To display each digit, starting with the rightmost digit and check it is divisible by 9
 */
public class assign4ques12 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,d1,d2,d3,d4,d5,sum;
		System.out.print("Enter a number : ");
		num=sc.nextInt();
		d1=num/10000;
		d2=(num%10000)/1000;
		d3=((num%10000)%1000)/100;
		d4=(((num%10000)%1000)%100)/10;
		d5=(((num%10000)%1000)%100)%10;
		System.out.println("Digits are " + d5 +" "+d4+" "+d3+" "+d2+" "+d1);
		sum=d1+d2+d3+d4+d5;
        if(sum==9)
        	System.out.println("Divisible by 9");
        else
        	System.out.println("not divisible ny 9");
	}

}
