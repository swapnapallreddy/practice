package com.coding.practice;

import java.util.Scanner;

public class StringDuplicateChars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		 String input=s.next();
		 
		System.out.println(isDuplicate(input));

  }
	private static boolean isDuplicate(String input)
	{
		boolean charSet[] = new boolean[128];
		 if(input.length()>128)
           return true;
		 
		 for(int i=0;i<input.length();i++)
		 {
			 char c=input.charAt(i);
			 if(charSet[c])
				 return true;
			  charSet[c] = true;
		 }
		 
		 return false;
		 
	}

}
