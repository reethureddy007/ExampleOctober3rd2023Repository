package com.sgtesting.parameterizedconstructorpracticeprograms;
//If instance variable name & parameter name both are same, in this case the parameter hides the instance variable within the body of constructor.
class Student3
{
	String firstName;
	String branchName;
	int rollNo;
	Student3(String firstName,String branchname,int rollNo)
	{
		firstName=firstName;
		branchName=branchname;
		rollNo=rollNo;
		System.out.println("first name :"+firstName);
		System.out.println("branch name :"+branchname);
		System.out.println("roll no :"+rollNo);
		System.out.println("-----------------------------");
	}
	void show()
	{
		System.out.println("Method bbody-----");
		System.out.println("first name :"+firstName);
		System.out.println("branch name :"+branchName);
		System.out.println("roll no :"+rollNo);
	}
}
public class Demo04ParameterizedConstructor {

	public static void main(String[] args) {
		Student3 obj3=new Student3("Reethan","ISE",38);
		obj3.show();
	}

}
