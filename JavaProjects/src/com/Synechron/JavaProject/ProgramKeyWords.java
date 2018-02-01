package com.Synechron.JavaProject;

class ThisKeyword
{
 float value;
 int values;
 String empName;
	 
ThisKeyword(float value)
{
	this.value=value;
}
ThisKeyword(float value,int values)
{
	this.value=value;
	this.values=values;
	
}
ThisKeyword(float value,int values,String empName)
{
	this.value=value;
	this.values=values;
	this.empName=empName;

}
void value()
{
	System.out.println(value);
}
void value2()
{
	System.out.println(value+" "+values);
}

void value3()
{
	System.out.println(value+" "+values+" "+empName);
}



}



public class ProgramKeyWords 
{
	public static void main(String args[])
	{
ThisKeyword thisKeyWord=new ThisKeyword(1.5f);
ThisKeyword thisKeyword2=new ThisKeyword(0.35f, 25);
ThisKeyword thisKeyword3=new ThisKeyword(0.35f, 25,"Raghavendra");
thisKeyWord.value();
thisKeyword2.value2();
thisKeyword3.value3();



}
	}
