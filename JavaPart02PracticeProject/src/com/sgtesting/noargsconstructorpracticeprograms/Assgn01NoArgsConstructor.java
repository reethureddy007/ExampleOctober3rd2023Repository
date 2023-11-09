package com.sgtesting.noargsconstructorpracticeprograms;

class Employee
{
	String firstName;
	String lastName;
	int age;
	int salary;
	Employee()
	{
		firstName="Reethan";
		lastName="Reddy";
		age=29;
		salary=50000;
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(salary);
		System.out.println("-------------------------");
	}
}
class Department
{
	String departmentName;
	int noofPeople;
	int noofManagers;
	int noofBranches;
	Department()
	{
		departmentName="IT";
		noofBranches=10;
		noofManagers=20;
		noofPeople=100;
		System.out.println(departmentName);
		System.out.println(noofBranches);
		System.out.println(noofManagers);
		System.out.println(noofPeople);
		System.out.println("--------------------------");
	}
}
class Insurance
{
	String isuranceName;
	String typeofInsurance;
	int costOfInsurance;
	int totalinsurances;
	Insurance()
	{
		isuranceName="GoDigit";
		typeofInsurance="Medical";
		totalinsurances=10;
		costOfInsurance=50000;
		System.out.println(isuranceName);
		System.out.println(typeofInsurance);
		System.out.println(totalinsurances);
		System.out.println(typeofInsurance);
	}
}
public class Assgn01NoArgsConstructor {

	public static void main(String[] args) {
		Employee emp=new Employee();
		
		Department dept=new Department();
		
		Insurance insur=new Insurance();
	}

}
