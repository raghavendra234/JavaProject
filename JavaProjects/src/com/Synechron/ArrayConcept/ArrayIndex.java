package com.Synechron.ArrayConcept;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int rollno;
	String name;
	int age;
	
	 Student(int rollno,String name,int age) {
this.age=age;
this.name=name;
this.rollno=rollno;
	 }
}


public class ArrayIndex {

	public static void main(String[] args)
	
	{
		Student st=new Student(12, "Abc", 24);
ArrayList<Student>al=new ArrayList<Student>();
al.add(st);

Iterator<Student> itr=al.iterator();
while(itr.hasNext()){
  Student st1=itr.next();
  System.out.print("rollno:"+st1.rollno+'\n'+"name:"+st1.name+'\n'+"age:"+st1.age);
}
	}

}
