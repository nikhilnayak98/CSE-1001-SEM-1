/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date : 26th September 2016, Monday
 * Brief Description: To design a Cipher which encrypts plaintext to ciphertext and decrypts ciphertext to plaintext.
 */


import java.util.Scanner;

public class Majorassgn1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int key,i;
		char letter;
		String plaintext,ciphertext,result="";
		System.out.print("Enter encryption key: ");
		key=sc.nextInt();
		System.out.print("Enter Plaintext - upper case letters only: ");
		plaintext=sc.next();
		for(i=0;i<plaintext.length();i++)
		{
			letter = plaintext.charAt(i);
			letter = (char)('A'+ (letter + key -'A')%26);
			result+=letter;
		}
		System.out.println("Ciphertext: " + result);
		System.out.print("Enter Ciphertext - upper case letters only: ");
		ciphertext=sc.next();
		System.out.println("Plaintext for each encryption key from 1 to 25: ");
		for(key=1;key<26;key++)
		{
			result="";
			for(i=0;i<ciphertext.length();i++)
			{
				letter = ciphertext.charAt(i);
				letter = (char)('Z'- ('Z' - letter + key)%26);
				result+=letter;
			}
			System.out.println("key " + key + ": plaintext = " + result);
		}
	}

}