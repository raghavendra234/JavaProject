package com.Synechron.JavaProject;

import java.util.Scanner;

public class Armstrong {
 static int c=0, a=0,temp;
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the value of S");
int string=s.nextInt();
temp=string;
while (string > 0) {

   a= string % 10;
   string = string / 10;

c=c+(a*a*a);
}
System.out.println(c);


if(temp==c)
{
	System.out.println("this is a armstrong nnumber");
}
else
{
	System.out.println("it is not a armstrong number");
}
	}

}

