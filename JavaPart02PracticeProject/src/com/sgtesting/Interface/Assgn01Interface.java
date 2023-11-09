package com.sgtesting.Interface;
//WAP for Multilevel inheritance in which sub class implements more than 2 interfaces
interface University
{
	void showUniversityName(String name);
}
interface College
{
	void showCollegeName(String name);
}
interface Branch
{
	void showBranchName(String name);
}
class Student implements Branch, College, University
{
	public void showUniversityName(String name)
	{
		System.out.println("University name :"+name);
	}
	public void showCollegeName(String name)
	{
		System.out.println("College name :"+name);
	}
	public void showBranchName(String name)
	{
		System.out.println("Branch name :"+name);
	}
	void showStudentRollNo(int rollno)
	{
		System.out.println("Student roll no :"+rollno);
	}
}
public class Assgn01Interface {

	public static void main(String[] args) {
		Student Oassgn01=new Student();
		Oassgn01.showUniversityName("VTU");
		Oassgn01.showCollegeName("BIT");
		Oassgn01.showBranchName("ISE");
		Oassgn01.showStudentRollNo(38);
	}

}
