import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Author:Nikhil Nayak
 * Regd.no:1641012040
 * Branch & Sec:CSE 'F'
 * Brief Desc: To print number of passed students and pass rate
 */
public class assign5ques5 
{

	public static void main(String[] args) throws IOException
	{
	Scanner inFile=new Scanner (new FileReader ("marks.dat"));
	int pass=0,fail,passrate;
	while (inFile.hasNextInt())
	{
		int mark=inFile.nextInt();
		if(mark>40)
			pass++;
	}
		inFile.close ();
		System.out.println("Total Passed Students :" + pass);
		System.out.println("Passrate : " + passrate);
	}

}
