package com.sgtesting.noargsconstructorpracticeprograms;


class Students1
{
	String firstName;
	String lastName;
	int age;
	String college;
	String branch;
	Students1()
	{
		age=20;
		branch="CS";
		college="BIT";
		firstName="Reethan";
		lastName="Reddy";
		System.out.println(age);
		System.out.println(branch);
		System.out.println(college);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println("--------------------------------------");
	}
}
class Library
{
	String libname;
	int noofBooks;
	int noofBranchesBooks;
	String libraryType;
	Library()
	{
		libname="BIT";
		libraryType="Physical";
		noofBooks=20000;
		noofBranchesBooks=1000;
		System.out.println(libname);
		System.out.println(libraryType);
		System.out.println(noofBooks);
		System.out.println(noofBranchesBooks);
		System.out.println("-----------------------------------------");
	}
}
class Sports
{
	String gamesName;
	String gameType;
	int noofItems;
	int totalItems;
	Sports()
	{
		gamesName="Cricket";
		gameType="Outdoor";
		noofItems=5;
		totalItems=100;
		System.out.println(gamesName);
		System.out.println(gameType);
		System.out.println(noofItems);
		System.out.println(totalItems);
		System.out.println("------------------------------------------");
		
	}
}
class CSDepartment
{
	int totalStudents;
	int totalStrength;
	int totalPass;
	int totalFail;
	int totalStaff;
	CSDepartment()
	{
		totalFail=10;
		totalPass=100;
		totalStaff=10;
		totalStrength=100;
		totalStudents=1000;
		System.out.println(totalFail);
		System.out.println(totalPass);
		System.out.println(totalStaff);
		System.out.println(totalStrength);
		System.out.println(totalStudents);
	}
}
public class Assgn03NoArgsConstructor {

	public static void main(String[] args) {
		Students1 obj1=new Students1();
		
		Library lib=new Library();
		
		Sports obj2=new Sports();
		
		CSDepartment obj3=new CSDepartment();
	}

}
