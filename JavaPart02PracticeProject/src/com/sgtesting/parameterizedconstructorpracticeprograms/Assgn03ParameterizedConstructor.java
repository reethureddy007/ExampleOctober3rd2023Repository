package com.sgtesting.parameterizedconstructorpracticeprograms;

class Students1
{
	String firstName;
	String lastName;
	int age;
	String college;
	String branch;
	Students1(String fn, String ln, int Age, String col, String bran)
	{
		firstName=fn;
		lastName=ln;
		age=Age;
		college=col;
		branch=bran;
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(college);
		System.out.println(branch);
		System.out.println("--------------------------------------");
	}
}
class Library
{
	String libname;
	int noofBooks;
	int noofBranchesBooks;
	String libraryType;
	Library(String lib, int books, int branch, String ltype)
	{
		libname=lib;
		noofBooks=books;
		noofBranchesBooks=branch;
		libraryType=ltype;
		System.out.println(libname);
		System.out.println(noofBooks);
		System.out.println(noofBranchesBooks);
		System.out.println(libraryType);
		System.out.println("-----------------------------------------");
	}
}
class Sports
{
	String gamesName;
	String gameType;
	int noofItems;
	int totalItems;
	Sports(String game, String gtype, int nitems, int titems)
	{
		gamesName=game;
		gameType=gtype;
		noofItems=nitems;
		totalItems=titems;
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
	CSDepartment(int tstudents, int stren, int pass, int fail, int staff)
	{
		totalStudents=tstudents;
		totalStrength=stren;
		totalPass=pass;
		totalFail=fail;
		totalStaff=staff;
	
		System.out.println(totalStudents);
		System.out.println(totalStrength);
		System.out.println(totalPass);
		System.out.println(totalFail);
		System.out.println(totalStaff);
		
		
	}
}

public class Assgn03ParameterizedConstructor {

	public static void main(String[] args) {
		
		Students1 obj1=new Students1("Reethan","Reddy",29,"BIT","ISE");
		
		Library lib=new Library("Engineering lib",1222,23,"Online");
		
		Sports obj2=new Sports("outdoor","cricket",20,200);
		
		CSDepartment obj3=new CSDepartment(10000,1000,500,40,200);
	}

}
