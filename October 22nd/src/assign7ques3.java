/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To read a set of Lyrics from a file named as “lyrics.txt” and store them into an array of strings. Find out the no of Lyrics stored in the array and display them.
 */
import java.util.Scanner;
import java.io.*;
public class assign7ques3 
{

	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner(new File("lyrics.txt"));
		String A[]=new String[30];
		int i=0;
		while(file.hasNextLine())
		{
			A[i]=file.nextLine();
			i++;
		}
		System.out.println("Number of lyrics = " + i);
		for(int j=0;j<i;j++)
		{
			System.out.println("Lyric " + (j+1) + " = " + A[j]);
		}
	}

}
