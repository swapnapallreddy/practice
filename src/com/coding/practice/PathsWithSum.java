package com.coding.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PathsWithSum {

	private static int noOfPaths =0;
	public static void main(String[] args)
	{
		//	     1
		//      / \
		//	   2   -1
		//    / \   /\               //4 paths : (1,-1,3) (1,2) (-1,4) (3)
		//   2   4 4  3
		//      /
		//     1 
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left=new Node(2);
		root.left.right= new Node(4);
		root.left.right.left =new Node(1);
		root.right = new Node(-1);
		root.right.left = new Node(4);
		root.right.right = new Node(3);
		ArrayList<Integer> path = new ArrayList<>();
		getSumPaths(root,3,path);
		System.out.println("No of Paths with sum: "+noOfPaths);
	}



	private static void getSumPaths(Node root,int sum,ArrayList<Integer> currentPath)
	{
		if(root==null)
			return ;

		currentPath.add(root.data);
		getSumPaths(root.left,sum,currentPath);
		getSumPaths(root.right,sum,currentPath);
		int currentSum = 0;
		for(int i= currentPath.size()-1;i>=0;i--)
		{
			currentSum += currentPath.get(i);
			if(currentSum==sum)
			{
				printVector(currentPath, i);
				noOfPaths++;
			}
		}
		currentPath.remove(currentPath.size()-1);
	}


	static void printVector( List<Integer> v, int i)  
	{  
	    for (int j = i; j < v.size(); j++)  
	        System.out.print( v.get(j) + " ");  
	        System.out.println();  
	}  
	  


	static class Node
	{
		int data;
		Node left=null;
		Node right=null;
		Node(int x)
		{
			this.data=x;
			this.left = null;
			this.right=null;

		}
	}

}

