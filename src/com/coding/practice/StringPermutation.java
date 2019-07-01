package com.coding.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string1,string2;

		System.out.println("Enter the first string");
		string1=scanner.next();
		System.out.println("Enter the second string");
		string2 = scanner.next();
		System.out.println(ispermute( string1, string2));

	}

	private static boolean ispermute(String s1, String s2)
	{
		final int totalChar = 256;

		if(s1.length()!=s2.length())
			return false;
		char cArray1[] = s1.toCharArray();
		char cArray2[] = s2.toCharArray();

		int intArray1[] = new int[256];
		int intArray2[] = new int[256];

		Arrays.fill(intArray1,0);
		Arrays.fill(intArray2,0);

		for(int i=0;i<s1.length()&&i<s2.length();i++)
		{
			intArray1[cArray1[i]]++;
			intArray2[cArray2[i]]++;
		}

		for(int j=0;j<intArray1.length;j++)
		{
			if(intArray1[j]!=intArray2[j])
				return false;
		}
		return true;



	}

}
