package com.Synechron.JavaProject;

import java.util.Scanner;

public class BubbleSortReverseOrder {

	public static void main(String[] args) {
		int i, j, temp;
	   
		int []num= {1,5,6,7,8,89,9,12,31};
		/*Scanner input = new Scanner(System.in);
	 
	    System.out.println("Enter the number of integers to sort:");
	    num = input.nextInt();*/
	 
	    
	 
	    
	    /*for (i = 0; i < num.length; i++) 
	      num[i] = input.nextInt();*/
	 
	    for (i = 0; i <num.length-1; i++) {
	      for (j = 0; j < num.length - i - 1; j++) {
	        if (num[j] < num[j+1]) 
	        {
	           temp = num[j];
	           num[j] = num[j+1];
	           num[j+1] = temp;
	        }
	      }
		
	     
	    
	}
	    for (i = 0; i < num.length; i++) 
	        System.out.println(num[i]);
	    }

	}




