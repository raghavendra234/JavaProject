package com.Synechron.JavaProject;

import java.util.Scanner;

public class TriangleTable {

	public static void main(String[] args) {
int number=1;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of s");
int row=s.nextInt();


System.out.println("*******************");

for(int c=0;c<=row;c++)
{
	for(int j=1;j<c;j++)
	{
		System.out.print(number+"  ");
		
		number++;
	}
	
	
	System.out.println();
}

	}

}
