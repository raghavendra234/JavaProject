package com.Synechron.JavaProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) throws Exception {
		
	//String inputString="My Name is Raghavendra";
	
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter the value of s");
		String inputString=s.next(s);*/
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
	String inputString=br.readLine();
		
		String[] words = inputString.split(" ");
		String result = "";
		System.out.println(words.length); 
		for (int i = words.length-1; i >= 0; i--) {
		 
			result += (words[i]+"  ");
			
		}
		/*System.out.println(result);
		*/
		for (int j = inputString.length()-1; j >= 0; j--) {
			 
			result += inputString.charAt(j);
			
		}
		System.out.println(result);
		
		}
		
			
	}
 

