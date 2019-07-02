package com.coding.practice;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a= s.nextInt();
		System.out.print("Enter the Second Number");
		int b= s.nextInt();
		
		int c = Math.round(a/b);
		int d= Math.round(b/a);
		
		try
		{
			int e=c/d;
		}catch(Exception e)
		{
			System.out.println("Max number"+a);
			return;
		}
		
		try
		{
			int f=d/c;
		}catch(Exception e)
		{
			System.out.println("Max number"+b);
			return;
		}
		
		try
		{
			int e=c/(d-1);
		}catch(Exception e)
		{
			System.out.println("Max number"+a);
			return;
		}
		
		try
		{
			int f=d/(c-1);
		}catch(Exception e)
		{
			System.out.println("Max number"+b);
			return;
		}
				
 	}

}
