package com.sgtesting.inheritance;
//WAP to describe multilevel inheritance.
class Company
{
	Company()
	{
		System.out.println("Super class BUSINESS ONE TECH");
	}
}
class Department extends Company
{
	Department()
	{
		System.out.println("Sub class1 IT");
	}
}
class Employee extends Department
{
	Employee()
	{
		System.out.println("Sub class 2REETHAN");
	}
}
public class Assgn01MultilevelInheritance {
	public static void main(String args[])
	{
		Employee assgn01=new Employee();
		
	}

}
