package com.Synechron.JavaProject;

public class BubleSort {

	public static void main(String[] args) {
int a[]= {1,2,34,54,6,7,88,9};
int temp='0';

for(int i=0;i<a.length;i++)
{
	 for (int j = 0; j <a.length-i-1; j++)
         if (a[j] > a[j+1])
         {
             // swap temp and arr[i]
              temp = a[j];
             a[j] = a[j+1];
             a[j+1] = temp;
         }
System.out.println(a[i]);
}
	}

}
