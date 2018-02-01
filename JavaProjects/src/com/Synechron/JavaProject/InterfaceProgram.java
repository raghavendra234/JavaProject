package com.Synechron.JavaProject;

import java.util.Scanner;

class InterfaceProgram 
{
public static void main(String[] args) 
{
int i,no, first, second, next;
Scanner s=new Scanner(System.in);
System.out.println("Enter number of terms for Series: ");
no=s.nextInt();
first=0;
second=1;
System.out.println("Fibonacci series are: ");
 for(i=0; i<=no; i++)
 {
  System.out.println(first);
  next = first + second;
  first = second;
  second = next;


 }
}
}