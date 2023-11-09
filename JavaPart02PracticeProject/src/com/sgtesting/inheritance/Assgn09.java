package com.sgtesting.inheritance;
//WAP multilevel inheritance in which each class contains same variable name and data type.
class Computer
{
	String comname;
	void show100()
	{
		System.out.println("super class:"+comname);
	}
}
class Laptop extends Computer
{
	String comname;
	Laptop()
	{
		super.comname=comname;
	}
	void show101()
	{
		System.out.println("sub class1:"+comname);
	}
}
class Tab extends Laptop
{
	String comname;
	Tab()
	{
		super.comname=comname;
	}
	void show102()
	{
		System.out.println("sub class2:"+comname);
	}
}
public class Assgn09 {

	public static void main(String[] args) {
		Tab assgn09=new Tab();
		assgn09.show102();
//		assgn09.show101("laptop dell");
//		assgn09.show100("desktop dell");
	}

}
