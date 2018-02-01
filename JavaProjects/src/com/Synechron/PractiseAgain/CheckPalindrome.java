package com.Synechron.PractiseAgain;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
String reverse="";
Scanner s=new Scanner(System.in);
System.out.println("enter the value of s");
String s1=s.next();
char[]value=s1.toCharArray();

for(int i=value.length-1;i>=0;i--)
{
	 reverse=reverse+value[i];
}

if(reverse.equalsIgnoreCase(s1))
{
	
	System.out.println("it is  a palindrome");
	}
else
{
	System.out.println("it is not a palindrome");
}

		
		
	}

}
