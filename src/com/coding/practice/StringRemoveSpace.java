package com.coding.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string1;
		System.out.println("Enter string");
		string1=scanner.nextLine();
		System.out.println(replaceSpace(string1));

	}

	private static char[] replaceSpace(String s1)
	{

		int spaceCount =0;
		char originalString[] =s1.toCharArray();
		for(int i=0;i<originalString.length;i++)
		{
			if(originalString[i]==' ')
				spaceCount++;
		}
		
		int newLength =s1.length()+spaceCount*2;
		char newString[] = new char[newLength];
		
		for(int i=originalString.length-1;i>=0;i--)
		{
			if(originalString[i]==' ')
			{
				newString[--newLength] ='0';
				newString[--newLength] ='2';
				newString[--newLength] ='%';
			}
			else
				newString[--newLength] = originalString[i];
		}
	
        return newString;
        		

	}

}
