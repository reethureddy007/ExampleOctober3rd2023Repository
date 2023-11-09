//create a class for students, library, sports, CS department & execute each members of class with 4 variables.
package com.sgtesting.practiceprogramsclassobject;
class Students1
{
	String firstName;
	String lastName;
	int age;
	String college;
	String branch;
}
class Library
{
	String libname;
	int noofBooks;
	int noofBranchesBooks;
	String libraryType;
}
class Sports
{
	String gamesName;
	String gameType;
	int noofItems;
	int totalItems;
}
class CSDepartment
{
	int totalStudents;
	int totalStrength;
	int totalPass;
	int totalFail;
	int totalStaff;
}
public class Assgn03Object {

	public static void main(String[] args) {
		Students1 obj1=new Students1();
		obj1.age=20;
		obj1.branch="CS";
		obj1.college="BIT";
		obj1.firstName="Reethan";
		obj1.lastName="Reddy";
		System.out.println(obj1.age);
		System.out.println(obj1.branch);
		System.out.println(obj1.college);
		System.out.println(obj1.firstName);
		System.out.println(obj1.lastName);
		System.out.println("--------------------------------------");
		
		Library lib=new Library();
		lib.libname="BIT";
		lib.libraryType="Physical";
		lib.noofBooks=20000;
		lib.noofBranchesBooks=1000;
		System.out.println(lib.libname);
		System.out.println(lib.libraryType);
		System.out.println(lib.noofBooks);
		System.out.println(lib.noofBranchesBooks);
		System.out.println("-----------------------------------------");
		
		Sports obj2=new Sports();
		obj2.gamesName="Cricket";
		obj2.gameType="Outdoor";
		obj2.noofItems=5;
		obj2.totalItems=100;
		System.out.println(obj2.gamesName);
		System.out.println(obj2.gameType);
		System.out.println(obj2.noofItems);
		System.out.println(obj2.totalItems);
		System.out.println("------------------------------------------");
		
		CSDepartment obj3=new CSDepartment();
		obj3.totalFail=10;
		obj3.totalPass=100;
		obj3.totalStaff=10;
		obj3.totalStrength=100;
		obj3.totalStudents=1000;
		System.out.println(obj3.totalFail);
		System.out.println(obj3.totalPass);
		System.out.println(obj3.totalStaff);
		System.out.println(obj3.totalStrength);
		System.out.println(obj3.totalStudents);
	}

}
