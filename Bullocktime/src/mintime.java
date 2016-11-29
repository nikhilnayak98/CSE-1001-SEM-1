import java.util.Scanner;

/*
 * Author: Nikhil Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To find minimum time.
 */
public class mintime 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bull[]=new int[5];
		int time=0,max_speed,min_speed,i;
		for(i=1;i<5;i++)
		{
			System.out.println("Enter Speed of Bullock : ");
			bull[i]=sc.nextInt();
		}
		for(i=1;i<4;i++)
		{
			if(bull[i]>bull[i+1])
			{
				max_speed=bull[i];
				min_speed=bull[i+1];
				time+=max_speed;
				bull[i+1]=min_speed;
			}
			else if(bull[i]<bull[i+1])
			{
				min_speed=bull[i];
				max_speed=bull[i+1];
				time+=max_speed;
				bull[i+1]=min_speed;
			}
		}
			System.out.println("Minimum Time : " + time);		
	}

}
