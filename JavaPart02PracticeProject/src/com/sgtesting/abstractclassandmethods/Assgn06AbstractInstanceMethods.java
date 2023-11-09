package com.sgtesting.abstractclassandmethods;
//If Abstract class contains only instance methods, WAP to execute instance methods
abstract class Assgn06Department1
{
	void showCollegeName()
	{
		String collName="BIT";
		System.out.println("College Name :"+collName);
	}
	int showTotalBranches(int branch)
	{
		return branch;
	}
	void showStudentNames(String Students[])
	{
		System.out.println("Students name are :");
		for(int i=0;i<Students.length;i++)
		{
			System.out.println(Students[i]);
		}
	}
}
class Assgn06Department2 extends Assgn06Department1
{
	
}
public class Assgn06AbstractInstanceMethods {
	public static void main(String[] args) {
		Assgn06Department1 OAssgn06=new Assgn06Department2();
		String s[]= {"Reethan","Surekha","Prabhaker","Gopal"};
		OAssgn06.showCollegeName();
		OAssgn06.showStudentNames(s);
		System.out.println("Total branches in college :"+OAssgn06.showTotalBranches(10));
	}

}
