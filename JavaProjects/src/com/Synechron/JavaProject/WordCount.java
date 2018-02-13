package com.Synechron.JavaProject;

public class WordCount {

	public static void main(String[] args) {
		String s = "Hyderabad is a beautiful city";
		 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') )
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	
	}

}
