package com.sgtesting.Interface;
//WAP to demonstrate one interface extend another interface at hierarchical level.
interface University2
{
	void showUniversity2(String name);
}
interface College2 extends University2
{
	void showCollege2(String name);
}
interface Branch2 extends University2
{
	void showBranch2(String name);
}
class Student2 implements Branch2
{
	public void showUniversity2(String name)
	{
		System.out.println("University name "+name);
	}
	public void showBranch2(String name)
	{
		System.out.println("Branch name "+name);
	}
	void Student2(String name)
	{
		System.out.println("Student name "+name);
	}
}
class Library2 implements College2
{
	public void showUniversity2(String name)
	{
		System.out.println("University name "+name);
	}
	public void showCollege2(String name)
	{
		System.out.println("College name "+name);
	}
	void showLibrary2(int total)
	{
		System.out.println("Total library books "+total);
	}
}
public class Assgn04Interface {
	public static void main(String[] args) {
		Student2 OAssgn40=new Student2();
		OAssgn40.showUniversity2("VTU");
		OAssgn40.showBranch2("ISE");
		OAssgn40.Student2("Reethan");
		System.out.println("----------------------------------------");
		Library2 OAssgn41=new Library2();
		OAssgn41.showUniversity2("VTU");
		OAssgn41.showCollege2("BIT");
		OAssgn41.showLibrary2(29000);
	}

}
