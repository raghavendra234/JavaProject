package com.Synechron.JavaProject;

public class LargestArrayJava {

	public static void main(String[] args) {
int [] value= {10,25,256,1010};

int min=value[0];
int max=value[0];

for(int i=1;i<value.length;i++)
{
	if(value[i]>max)
	{
		max = value[i];
	}
	
	if(value[i]<min)
	{
		min=value[i]-1;
	}
}

System.out.println(max);
/*System.out.println(min);
*/
	}

}
