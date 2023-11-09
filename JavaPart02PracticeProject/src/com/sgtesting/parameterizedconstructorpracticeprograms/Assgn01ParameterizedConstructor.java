package com.sgtesting.parameterizedconstructorpracticeprograms;

class Employee
{
	String firstName;
	String lastName;
	int age;
	int salary;
	Employee(String fn, String ln, int Age, int sal)
	{
		firstName=fn;
		lastName=ln;
		age=Age;
		salary=sal;
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
	Department(String dname, int people, int manager, int branch)
	{
		departmentName=dname;
		noofBranches=branch;
		noofManagers=manager;
		noofPeople=people;
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
	Insurance(String insur, String type, int cost, int total)
	{
		isuranceName=insur;
		typeofInsurance=type;
		totalinsurances=cost;
		costOfInsurance=total;
		System.out.println(isuranceName);
		System.out.println(typeofInsurance);
		System.out.println(totalinsurances);
		System.out.println(total);
	}
}
public class Assgn01ParameterizedConstructor {

	public static void main(String[] args) {
		Employee emp=new Employee("Reethan","Reddy",29,52000);
		
		Department dept=new Department("IT",2,10,100);
		
		Insurance insur=new Insurance("GoDigit","Medical",10000,100000);
	}

}
