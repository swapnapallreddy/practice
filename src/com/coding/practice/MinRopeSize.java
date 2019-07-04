package com.coding.practice;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinRopeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int count=s.nextInt();
		PriorityQueue< Integer> pq= new PriorityQueue<>();
		while(count-->0)
		{
			int n = s.nextInt();
			pq.add(n);
		}
		
		int minSize =0;
		while(pq.size()>=2)
		{
			int r1 = pq.poll();
			int r2 =pq.poll();
			minSize += r1+r2;
			pq.add(r1+r2);
		}
		
		System.out.print("min rope size: "+minSize);

	}
	


}
