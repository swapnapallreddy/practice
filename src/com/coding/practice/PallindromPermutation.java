package com.coding.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PallindromPermutation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string1;
		System.out.println("Enter string");
		string1=scanner.nextLine();
		System.out.println(isPallindromPermutation(string1));

	}

	private static boolean isPallindromPermutation(String s1)
	{

		int pArray[] = new int[127];

		Arrays.fill(pArray,0);
		int odd=0;
		boolean duplicate =true;;

		char sArray[] = s1.toCharArray();

		for(int i =0;i<sArray.length;i++)
		{
			pArray[sArray[i]]++;
			
			if(i<sArray.length-1&&sArray[i]!=sArray[i+1])
				duplicate=false;
		}

		for(int i=0;i<pArray.length;i++)
		{
			if(pArray[i]%2!=0)
				odd++;
		}
		if(duplicate)
			return true;
		if(odd>1)
			return false;
		return true;

	}

}
