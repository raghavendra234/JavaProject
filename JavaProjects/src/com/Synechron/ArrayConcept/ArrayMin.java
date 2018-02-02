package com.Synechron.ArrayConcept;

public class ArrayMin {

	public static void main(String[] args) {
int []value= {100,200,400};
		int min=400;
for(int i=0;i>value.length;i++)
{
	if(min<=value[i])
	{
	min=min+value[i];
	}
}
System.out.println(min);
	}

}
