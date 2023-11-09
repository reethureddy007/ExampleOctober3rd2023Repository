package com.sgtesting.inheritance;
//WAP to describe Hierarchical Inheritance
class College
{
	void show1(String name1)
	{
		System.out.println("super class :"+name1);
	}
}
class Branch extends College
{
	void show2(String name2)
	{
		System.out.println("sub class 1 :"+name2);
	}
}
class Student extends Branch
{
	void show3(String name3)
	{
		System.out.println("sub class 1:"+name3);
	}
}
public class Assgn02HierarchicalInheritance {

	public static void main(String[] args) {
		Student assgn02=new Student();
		assgn02.show3("Reethan");
		assgn02.show2("ISE");
		assgn02.show1("BIT");
	}

}
