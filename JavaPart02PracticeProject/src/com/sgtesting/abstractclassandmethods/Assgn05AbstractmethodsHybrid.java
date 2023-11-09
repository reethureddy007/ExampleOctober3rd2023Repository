package com.sgtesting.abstractclassandmethods;
//In hybrid inheritance super class contains abstract methods, based on sub class object execute all methods.
abstract class Assgn05Student1
{
	abstract String showStudentName(String sname);
	abstract void showStudentRollNo();
	abstract void showStudentBranch();
	abstract void showStudentCollege(String collname);
}
class Assgn05Student2 extends Assgn05Student1
{
	String showStudentName(String sname) 
	{
		return sname;
	}
	void showStudentRollNo()
	{
		int rollno=38;
		System.out.println("Student roll number :"+rollno);
	}
	void showStudentBranch()
	{
		String bname="ISE";
		System.out.println("Student branch :"+bname);
	}
	void showStudentCollege(String collname)
	{
		System.out.println("College name :"+collname);
	}
}
class Assgn05Student3 extends Assgn05Student2
{
	
}
class Assgn05Student4 extends Assgn05Student1
{
	String showStudentName(String sname) 
	{
		return sname;
	}
	void showStudentRollNo()
	{
		int rollno=38;
		System.out.println("Student roll number :"+rollno);
	}
	void showStudentBranch()
	{
		String bname="ISE";
		System.out.println("Student branch :"+bname);
	}
	void showStudentCollege(String collname)
	{
		System.out.println("College name :"+collname);
	}
}
public class Assgn05AbstractmethodsHybrid {

	public static void main(String[] args) {
		Assgn05Student4 O1Assgn05=new Assgn05Student4();
		System.out.println("Student name :"+O1Assgn05.showStudentName("Surekha"));
		O1Assgn05.showStudentRollNo();
		O1Assgn05.showStudentBranch();
		O1Assgn05.showStudentCollege("AIT");
		
		Assgn05Student1 O2Assgn05=new Assgn05Student3();
		System.out.println("Student name :"+O2Assgn05.showStudentName("Reethan"));
		O2Assgn05.showStudentRollNo();
		O2Assgn05.showStudentBranch();
		O2Assgn05.showStudentCollege("BIT");
	}

}
