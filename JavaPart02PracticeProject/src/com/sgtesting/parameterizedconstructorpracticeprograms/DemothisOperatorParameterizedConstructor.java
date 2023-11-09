 package com.sgtesting.parameterizedconstructorpracticeprograms;
//If instance variable name & parameter name both are same, in this case the parameter hides the instance variable within the body of constructor
// we have to use this operator to overcome this situation.
 class Student4
 {
	 String firstname;
	 String branchname;
	 int rollNo;
	 Student4(String firstname, String branchname,int rollno)
	 {
		 this.firstname=firstname;
		 this.branchname=branchname;
		 rollNo=rollno;
		 System.out.println("first name: "+firstname);
		 System.out.println("branch name: "+branchname);
		 System.out.println("roll no: "+rollNo);
		 System.out.println("-----------------------");
	 }
	 void display()
	 {
		 System.out.println("In method body---------");
		 System.out.println("first name: "+firstname);
		 System.out.println("branch name: "+branchname);
		 System.out.println("roll no: "+rollNo);
	 }
 }
public class DemothisOperatorParameterizedConstructor {

	public static void main(String[] args) {
		Student4 obj4=new Student4("Reethan","ISE",38);
		obj4.display();
	}

}
