package fcu.iecs.oop;

import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args) {
	
	
    int a;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a integer:");
	a=scanner.nextInt();
	String[] num={"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN"};
	
	if(a>=1&&a<=9)
	{
		System.out.printf("The input integer is ¡§%s¡¨.",num[a-1]);
		
	}
	else
	{
		
		System.out.println("The input integer is ¡§OTHER¡¨");
		
	}
	
	
	
	
	
	}
}
