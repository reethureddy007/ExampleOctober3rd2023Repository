package com.sgtesting.parameterizedconstructorpracticeprograms;
//Suppose the values which are supplied as a parameterized constructor, same value you would like to use in a same class & other methods, in this
//case you have to prefer assigning parameter value into a instance variable.

class Student2
{
	String firstName;
	String branchName;
	int rollno;
	Student2(String fname,String branch,int RollNo)
	{
		firstName=fname;
		branchName=branch;
		rollno=RollNo;
		System.out.println("First Name:"+firstName);
		System.out.println("Branch Name:"+branchName);
		System.out.println("rollno:"+rollno);
	}
	void show()
	{
		System.out.println("In method body....");
		System.out.println("First Name:"+firstName);
		System.out.println("Branch Name: "+branchName);
		System.out.println("Roll No: "+rollno);
	}
}
public class Demo03ParameterizedConstructor {
	public static void main(String[] args) {
		Student2 obj1=new Student2("Reethan","ISE",38);
		obj1.show();
	}

}
