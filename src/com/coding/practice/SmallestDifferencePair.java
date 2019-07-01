package com.coding.practice;

import java.util.Arrays;

public class SmallestDifferencePair {


	public static void main(String[] args) {

		int array[] = {12,34,46,78,45};

		Arrays.sort(array);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i+1]-array[i]<min)
				min = array[i+1]-array[i];
		}


		System.out.println("minimun difference of pair is"+ min);


	}


}


