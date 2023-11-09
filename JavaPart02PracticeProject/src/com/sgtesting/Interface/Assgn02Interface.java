package com.sgtesting.Interface;
//WAP for multiple inheritance in which sub class extends an abstract class and implements more than 2 interface.
abstract class  Company
{
	abstract void showCompanyName(String name);
}
interface Department
{
	void showDepartmentName(String name);
}
interface Branch1
{
	void showBranchName(String name);
}
interface Job
{
	void showJobName(String name);
}
class Employee extends Company implements Department, Branch1, Job
{
	void showCompanyName(String name)
	{
		System.out.println("Abstract class Company name :"+name);
	}
	public void showDepartmentName(String name)
	{
		System.out.println("Department name :"+name);
	}
	public void showBranchName(String name)
	{
		System.out.println("Branch name :"+name);
	}
	public void showJobName(String name)
	{
		System.out.println("Job name :"+name);
	}
	void showEmployeeName(String name)
	{
		System.out.println("Employee name :"+name);
	}
}
public class Assgn02Interface {

	public static void main(String[] args) {
		Employee OAssgn02=new Employee();
		OAssgn02.showCompanyName("BOT");
		OAssgn02.showDepartmentName("IT");
		OAssgn02.showBranchName("PNP");
		OAssgn02.showJobName("QA");
		OAssgn02.showEmployeeName("Reethan");
	}

}
