package com.coding.practice;

import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string1,string2;
		System.out.println("Enter first string");
		string1=scanner.nextLine();
		System.out.println("Enter second string");
		string2 = scanner.nextLine();
		System.out.println(isOneAway(string1,string2));

	}

	private static boolean isOneAway(String s1,String s2)
	{
		if(s1.equals(s2))
			return false;
		
		int diff= 0;
		
		if(s1.length()==s2.length() )
		{
		  for(int i=0;i<s1.length();i++)
		  {
			  if(s1.charAt(i)!=s2.charAt(i))
				  diff++;
			  if(diff>1)
			   return false;
		  }
			
		}
		else
		{
			
		}

	}

}
