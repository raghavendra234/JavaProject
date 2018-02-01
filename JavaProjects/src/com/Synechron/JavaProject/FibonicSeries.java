package com.Synechron.JavaProject;

public class FibonicSeries {

	public static void main(String[] args) {
int n=10,a ,b=0,c =1;

for(int i = 0; i <= n; i++)
{
    a = b;
    b = c;
    c = a + b;
    System.out.print(a+", ");

}


	}

}
