package com.coding.practice;

import java.util.Scanner;

public class EnglishInt {
	private static final String [] units= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	private static final String [] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a= s.nextInt();
		System.out.print(convertToWords(a));
 	}
	
	private static String convertToWords(int a)
	{
		String numberWords= null;
		if(a<20)
			numberWords = units[a];
		if(a>=20&&a<100)
			numberWords = new StringBuilder().append(tens[a/10]).append(" ").append(units[a%10]).toString().trim();
		if(a>=100&&a<1000)
			numberWords = new StringBuilder().append(convertToWords(a/100)).append(" hundred ").append(convertToWords(a%100)).toString().trim();
		if(a>=1000&&a<100000)
			numberWords = new StringBuilder().append(convertToWords(a/1000)).append(" thousand ").append(convertToWords(a%1000)).toString().trim();
		if(a>=100000&&a<1000000)
			numberWords = new StringBuilder().append(convertToWords(a/1000)).append(" thousand ").append(convertToWords(a%1000)).toString().trim();
		return numberWords;

	}

}
