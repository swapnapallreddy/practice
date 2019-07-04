package com.coding.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Subtree {

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
		
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.left.left=new Node(2);
		root1.left.right= new Node(4);
		root1.left.right.left =new Node(1);
		root1.right = new Node(-1);
		root1.right.left = new Node(4);
		root1.right.right = new Node(3);
		
//		   2
//		  / \
//       2	 4
//          /
//          1
 		Node root2 = new Node(2);
		root1.left = new Node(2);
		root1.right= new Node(4);
		root1.right.left =new Node(1);
				
        	
		System.out.println(isSubtree(root1, root2)	);
	}



	private static boolean areIdentical(Node root1,Node root2)
	{
		if(root1==null&&root2==null)
			return true;
		if(root1==null||root2==null)
			return false;
		return root1.data==root2.data
				&&areIdentical(root1.left, root2.left)
				&&areIdentical(root1.right, root2.right);
	}
	  
 private static boolean isSubtree(Node root1,Node subRoot1)
  {
	  if(subRoot1==null)
		  return true;
	  if(root1==null)
		  return false;
	  if(areIdentical(root1, subRoot1))
		  return true;
	  return isSubtree(root1.left, subRoot1)
			  || isSubtree(root1.right, subRoot1);
  }

	static class Node
	{
		int data;
		Node left=null;
		Node right=null;
		Node nextRight =null;
		Node(int x)
		{
			this.data=x;
			this.left = null;
			this.right=null;
			this.nextRight=null;

		}
	}

}

