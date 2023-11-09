package com.sgtesting.constructoroverloadingpracticeprograms;
//By using constructor overloading create below University class.
class University
{
	String Uname;
	String address;
	int pincode;
	University(String uname)
	{
		Uname=uname;
		System.out.println(Uname);
		System.out.println("-------------------------");
	}
	University(String uname,String address)
	{
		Uname=uname;
		this.address=address;
		System.out.println(uname);
		System.out.println(address);
		System.out.println("----------------------------");
	}
	University(String uname, String address, long pincode)
	{
		System.out.println(uname);
		System.out.println(address);
		System.out.println(pincode);
		System.out.println("---------------------------");
	}
	University(int totalStaff, int totalStudent)
	{
		System.out.println(totalStaff);
		System.out.println(totalStudent);
		System.out.println("---------------------------");
	}
	void show()
	{
		System.out.println(address);
		System.out.println(Uname);
		System.out.println("-----------------------------");
	}
}
public class Assgn01ConstructorOverloading {

	public static void main(String[] args) {
		University obj1=new University("VTU");
		University obj2=new University("VTU","BELGAUM");
		obj2.show();
		University obj3=new University("VTU","BELGAUM",560060);
		University obj4=new University(1000,100000);
		
	}

}
