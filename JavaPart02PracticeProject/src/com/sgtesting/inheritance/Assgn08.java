package com.sgtesting.inheritance;
//WAP multilevel each class contain same method name with signature.
class College100
{
	void display100(String name)
	{
		System.out.println(name);
	}
}
class Branch100 extends College100
{
	Branch100(String name)
	{
		super.display100(name);
	}
	void display100(String name)
	{
		System.out.println(name);
	}
}
class Student100 extends Branch100
{
	Student100(String name)
	{
		super(name);
		super.display100(name);
	}
	void display100(String name)
	{
		System.out.println(name);
	}
	
}
public class Assgn08 {

	public static void main(String[] args) {
		Student100 assgn08=new Student100("BIT");
		assgn08.display100("Reethan");
	}

}
