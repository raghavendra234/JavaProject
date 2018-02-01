package com.Synechron.JavaProject;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
int rev=0;

Scanner s=new Scanner(System.in);
System.out.println("enter the value of s");
int  num=s.nextInt();
for( ;num != 0; )
{
	rev = rev * 10;
	rev = rev + num%10;
    num = num/10;
}
System.out.println("Reverse of specified number is: "+rev);

}
}