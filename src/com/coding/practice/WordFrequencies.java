package com.coding.practice;

import java.util.Scanner;

public class WordFrequencies {


	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("enter the string :");
		String x= s.next();
		String[] book = {"elephant","eat","god","monkey","eat"};
		int count=0;
		for(int i=0;i<book.length;i++)
		{
			if(book[i].equals(x))
				count++;
		}
		
		System.out.println("number of occurences: "+ count);
		

	}


}


