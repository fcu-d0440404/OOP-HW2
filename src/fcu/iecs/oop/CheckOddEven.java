package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer:");
		a=scanner.nextInt();
		
		if(a%2==0)
		{
			System.out.println("The input integer is Even Number.");
		}
		else 
		{
			System.out.println("The input integer is Odd Number.");
		}
		
		
		

	}

}
