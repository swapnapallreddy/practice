package com.coding.practice;

import java.util.Scanner;

public class TripleStep {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(findStep(n));

	}

	private static int findStep(int n)
	{
		if(n==0||n==1)
			return 1;
		if(n==2)
			return 2;
		else
			return findStep(n-1)+findStep(n-2)+findStep(n-3);
	}
}


