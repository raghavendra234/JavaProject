package com.Synechron.JavaProject;

import java.util.Scanner;
class ReveseNumber 
{
public static void main(String[] args) 
{
int no,rev=0,r,a;
Scanner s=new Scanner(System.in);
System.out.println("Enter any no.: ");
no=s.nextInt();
a=no;
while(no>0)
{
r=no%10;
System.out.println(r);
rev=rev*10+r;
System.out.println(rev);
/*no=no/10;*/
}
/*System.out.println("Reverse: "+rev);
*/}
}