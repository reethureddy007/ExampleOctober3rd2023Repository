package com.sgtesting.abstractclassandmethods;
//In multilevel inheritance super class contains abstract methods, based on sub class object execute all members.
abstract class Assgn04Department1
{
	abstract void showDepartmentName(String dname);
	abstract void showDempartmentMembers(int total);
}
abstract class Assgn04Department2 extends Assgn04Department1
{
	abstract void showDepartmentBranches(int num);
}
class Assgn04Department3 extends Assgn04Department2
{
	void showDepartmentName(String dname)
	{
		System.out.println("department name :"+dname);
	}
	
	void showDepartmentBranches(int num)
	{
		System.out.println("total branches :"+num);
	}

	void showDempartmentMembers(int total) {
		System.out.println("total staff :"+total);
	}
}
public class Assgn04AbstractMethodsMulti {
	public static void main(String[] args) {
		Assgn04Department3 OAssgn04=new Assgn04Department3();
		OAssgn04.showDepartmentName("IT");
		OAssgn04.showDepartmentBranches(10);
		OAssgn04.showDempartmentMembers(500);
	}

}
