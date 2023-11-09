//Create a class for employee, department, insurance & execute each class members, with atleast 4 variables.
package com.sgtesting.practiceprogramsclassobject;
class Employee
{
	String firstName;
	String lastName;
	int age;
	int salary;
}
class Department
{
	String departmentName;
	int noofPeople;
	int noofManagers;
	int noofBranches;
}
class Insurance
{
	String isuranceName;
	String typeofInsurance;
	int costOfInsurance;
	int totalinsurances;
}
public class Assgn01Object {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.firstName="Reethan";
		emp.lastName="Reddy";
		emp.age=29;
		emp.salary=50000;
		System.out.println(emp.firstName);
		System.out.println(emp.lastName);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		System.out.println("-------------------------");
		Department dept=new Department();
		dept.departmentName="IT";
		dept.noofBranches=10;
		dept.noofManagers=20;
		dept.noofPeople=100;
		System.out.println(dept.departmentName);
		System.out.println(dept.noofBranches);
		System.out.println(dept.noofManagers);
		System.out.println(dept.noofPeople);
		System.out.println("--------------------------");
		Insurance insur=new Insurance();
		insur.isuranceName="GoDigit";
		insur.typeofInsurance="Medical";
		insur.totalinsurances=10;
		insur.costOfInsurance=50000;
		System.out.println(insur.isuranceName);
		System.out.println(insur.typeofInsurance);
		System.out.println(insur.totalinsurances);
		System.out.println(insur.typeofInsurance);
	}

}
