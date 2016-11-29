import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To assign a grade to student
 */
public class assign3ques9 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int marks;
		System.out.println("Enter marks");
		marks=sc.nextInt();
		switch((marks+5)/10)
		{
			case 10: System.out.println("O Grade");
					 break;
			case 9: System.out.println("A Grade");
			 		 break;
			case 8: System.out.println("B Grade");
			 		 break;
			case 7: System.out.println("C Grade");
			 		 break;
			case 6: System.out.println("D Grade");
			 		 break;
			case 5: System.out.println("E Grade");
			 		 break;
			default: System.out.println("F Grade");
					 break;
		}

	}

}
