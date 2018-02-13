package com.Synechron.ArrayConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class SortedProgram {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
	       al.add("pen");
	       al.add("pencil");
	       al.add("ink");
	       al.add("notebook");
	       al.add("book");
	       al.add("books");
	       al.add("paper");
	       al.add("white board");
	       al.add("Raghavendra");

	       for(int i=0;i<al.size();i++)
	       {
	    	  
	    	  if(al.get(i).equalsIgnoreCase("Raghavendra"))
	    	  {
	    		  System.out.println(al.get(i));
	    	  }
	    	  else
	    	  {
	    		  System.out.println("ignore");
	    	  }
	    	  
	       }
	}

}
