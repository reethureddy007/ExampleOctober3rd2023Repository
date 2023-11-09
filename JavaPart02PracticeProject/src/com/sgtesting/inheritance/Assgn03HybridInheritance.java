package com.sgtesting.inheritance;
//WAM to describe hybrid inheritance.
class Country
{
	void show1(String cname)
	{
		System.out.println("super class :"+cname);
	}
}
class State extends Country
{
	void show2(String sname)
	{
		System.out.println("sub class1 :"+sname);
	}
}
class Dist extends Country
{
	void show3(String dname)
	{
		System.out.println("sub class 1 :"+dname);
	}
}
class Taluk extends Dist
{
	void show4(String tname)
	{
		System.out.println("sub class 2 :"+tname);
	}
}
public class Assgn03HybridInheritance {

	public static void main(String[] args) {
		Taluk assgn03=new Taluk();
		assgn03.show4("CMY");
		assgn03.show3("Chikkaballapur");
		assgn03.show1("INDIA");
		
		State aggn003=new State();
		aggn003.show2("Karnataka");
		aggn003.show1("BHARAT");
	}

}
