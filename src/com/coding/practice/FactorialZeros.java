package com.coding.practice;

import java.util.Scanner;

public class FactorialZeros {


	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("enter number :");
		int x= s.nextInt();
		int count=0;
		for(int i=5;x/i>1;i*=5)
		{
			count+=x/i;
		}
		
		System.out.println("Count of trailing 0s in: "+x+"! is"+ count);
		

	}


}


