package com.coding.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NumberSwapper {


	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("enter x value :");
		int x= s.nextInt();
		System.out.println("enter y value :");
		int y= s.nextInt();
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping values: x="+x + " y="+y );

	}


}


