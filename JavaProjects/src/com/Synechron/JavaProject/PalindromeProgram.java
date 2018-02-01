package com.Synechron.JavaProject;

public class PalindromeProgram {

	public static void main(String[] args) {
		
		String value="raghavendra", reverse="";
		char[]strrev=value.toCharArray();
		for(int i=strrev.length-1;i>=0;i--)

		{
			reverse=reverse+strrev[i];
			
		}
		System.out.println(reverse);
		
		if(reverse.equalsIgnoreCase(value))
		{
			System.out.println("the value "+reverse +"  is a palindrome");
		}
		else
			
		{
			System.out.println("it is not a palindrome");
		}
	}

}
