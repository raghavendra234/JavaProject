package com.Synechron.ArrayConcept;

public class ArrayMax {

	public static void main(String[] args) {
int [] value= {1,2,34,5,6,7,100};
int max=1;

for(int i=0;i<value.length;i++)
{
	if(max<value[i])
	{
	max=value[i];
	
	
	}
}
System.out.println(max);
	
	}

}
