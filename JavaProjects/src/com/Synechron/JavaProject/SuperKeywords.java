package com.Synechron.JavaProject;

class thiskey 
{
 float value;
 int values=15;
 String empName;
	 
}
class superme extends thiskey
{
	int values=25;


void superKeyword(int a, Float b)
{
	System.out.println(a);
	System.out.println(super.value);
}
}

public class SuperKeywords {

	public static void main(String args[])
	{
		superme Super=new superme();
		Super.superKeyword(21,23f);
	
		
	}
}

