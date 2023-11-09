//Without using instance variables can we use parameterized constructor in class.
package com.sgtesting.parameterizedconstructorpracticeprograms;
class Student
{
	Student(String fname,String branch,int rollno)
	{
		System.out.println("First Name:"+fname);
		System.out.println("Branch Name:"+branch);
		System.out.println("Roll No:"+rollno);
	}
}
public class Demo02ParameterizedConstructor {

	public static void main(String[] args) {
		Student obj=new Student("Reethan","ISE",38);
	}

}
