import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: Egg
 */
public class assign2ques13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int eggs,gross,aboveGross,dozens,extras;       
	    System.out.println("How many eggs do you have?  ");
	    eggs=sc.nextInt();
	    gross=eggs/144;
	    aboveGross=eggs%144;
	    dozens=aboveGross/12;
	    extras=aboveGross%12;          
	    System.out.println("Your number of eggs is " + gross +" gross, " + dozens + " dozens and " + extras);
	}
}
