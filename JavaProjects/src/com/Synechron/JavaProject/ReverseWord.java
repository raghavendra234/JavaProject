package com.Synechron.JavaProject;

public class ReverseWord {

	public static void main(String[] args) {
		
		String inputString="My Name is Raghavendra";
		String[] words = inputString.split(" ");
		String result = "";
		//System.out.println(words.length);
		for (int i = words.length - 1; i >= 0; i--) {
		 
			result += (words[i]+"  ");
			
		}
		System.out.println(result.trim());
		

		}
		
			
	}
 

