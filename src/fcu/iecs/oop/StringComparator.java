package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {
	
	
	public static void main(String[] args) {
	String a,b;
	int i=0;
	Scanner scanner = new Scanner(System.in);
	while(i==0)
	{
		
		System.out.println("Enter a string 1:");
		a=scanner.next();
		System.out.println("Enter a string 2:");
		b=scanner.next();
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("The two strings are the same.");
			break;
		}
		else
		{
			System.out.println("The two strings are not the same.");
		}
		
		
		
	}
	
	scanner.close();
	}
	

}
