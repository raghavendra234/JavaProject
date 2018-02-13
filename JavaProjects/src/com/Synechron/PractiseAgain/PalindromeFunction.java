package com.Synechron.PractiseAgain;

public class PalindromeFunction {

	public static void main(String[] args) {
String s="121",reverse="";
char[]value=s.toCharArray();
for(int i=value.length-1;i>=0;i--)
{
	reverse=reverse+value[i];
	
	
}


if(reverse.equalsIgnoreCase(s))
{
	System.out.println("it  is palindrome");
}
else
{
	System.out.println("it is not palindrome");
}
	}

}
