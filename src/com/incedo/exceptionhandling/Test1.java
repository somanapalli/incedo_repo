package com.incedo.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		int division=0;
		Scanner scanner = new Scanner(System.in);
		try {
		
			System.out.println("enter first no:");
			int fno = scanner.nextInt();
			
			System.out.println("enter second no:");
			int sno = scanner.nextInt();
			
			division = fno/sno;
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("don't enter zero as denominator");
		}
		
		catch(InputMismatchException ime)
		{
			System.out.println("please pass only numeric values");
		}
		
		finally
		{
			System.out.println("iam from fianlly block");
		}
		System.out.println("division is: " + division);
		System.out.println("Rest of the statements not executed");
		System.out.println("Rest of the statements not executed");
		System.out.println("Rest of the statements not executed");
		System.out.println("Rest of the statements not executed");
		System.out.println("Rest of the statements not executed");
		
	}

}
