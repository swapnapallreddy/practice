package com.coding.practice;

import java.util.Arrays;
import java.util.HashSet;

public class SparseSimilarity {


	public static void main(String[] args) {

		printSimilarity(new Document[] {
				new Document(13, new int[] { 14, 15, 100, 9, 3 }),
				new Document(16, new int[] { 32, 1, 9, 3, 5 }),
				new Document(19, new int[] { 15, 29, 2, 6, 8, 7 }),
				new Document(24, new int[] { 7, 10 })
		});

	}

	public static void printSimilarity (Document[] docs)
	{
		for(int i=0;i<docs.length;i++)
		{
			for(int j=i+1;j<docs.length;j++)
			{
				docs[i].printSimilarity(docs[j]);
			}
			
		}
	}
}

	class Document
	{
		int id;
		HashSet<Integer> values = new HashSet<>();
		public Document(int id, int[] values) {
			this.id= id;
			for(int i=0;i<values.length;i++)
				this.values.add(values[i]);
		}
		
		public int getSize()
		{
			return values.size();
		}
		public HashSet<Integer> getValues()
		{
			return values;
		}
	  public void printSimilarity(Document d)
	  {
		  Document iterateDocument;
		  Document noniterateDocument;
		  int interSectionCount =0;
		  int union =0;
             if(getSize()<d.getSize())
             {
            	 iterateDocument=this;
            	 noniterateDocument = d;
             }
             else
             {
            	 iterateDocument =d;
            	 noniterateDocument =this;
             }
             for(int value:iterateDocument.getValues())
             {
            	 if(iterateDocument.getValues().contains(value))
            		 interSectionCount++;
             }
            	
             if(interSectionCount>0)
             {
            	 union = iterateDocument.getSize()+noniterateDocument.getSize()-interSectionCount;
            	 System.out.println(id + ", " + d.id + "   " + ((double)interSectionCount / union));
             }
	  }
	}


