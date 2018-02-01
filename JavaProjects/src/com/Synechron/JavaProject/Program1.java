package com.Synechron.JavaProject;


abstract class FinalMethod
{
	
	 abstract void FinalMe();
	 static int h1;
	 void finalYou()
	 {
		 System.out.println("hai");
	final int h=123;
	System.out.println(h);
	System.out.println(h1);
	 }
	 
	
}



class Fin extends FinalMethod
{

		void FinalMe()
		{
			  int i, j,n=3;
			  
		        // outer loop to handle number of rows
		        //  n in this case
		        for(i=0; i<n; i++)
		        {
		
		            //  inner loop to handle number of columns
		            //  values changing acc. to outer loop  
		            for(j=0; j<=i; j++)
		            {
		                // printing stars
		                System.out.print(" *");
		         
		            }
		 
		            // ending line after each row
		          
		            System.out.println();
		        }
		}
	
}

public class Program1{
	public static void main(String[] args) {

		FinalMethod obj = new Fin();   
		 obj.FinalMe(); 
		 obj.finalYou();

}}

