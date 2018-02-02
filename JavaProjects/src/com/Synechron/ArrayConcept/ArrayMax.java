package com.Synechron.ArrayConcept;

public class ArrayMax {

	public static void main(String[] args) {
int [] value= {1,2,34,5,6,7,100};
int max=100;

for(int i=value.length;i>=0;i--)
{
	if(max>=value[i])
	{
	max=value[i];
	
	
	}
}
System.out.println(max);
	
	}

}
