package com.sgtesting.abstractclassandmethods;
//In Multilevel inheritance super class is an abstract class, it contains parameterized constructor.
abstract class Assgn03College1
{
	Assgn03College1(String nameOne)
	{
		System.out.println(nameOne);
	}
}
class Assgn03College2 extends Assgn03College1
{
	Assgn03College2(String nameTwo)
	{
		super(nameTwo);
	}
}
class Assgn03College3 extends Assgn03College2
{
	Assgn03College3(String nameThree)
	{
		super(nameThree);
	}
}
public class Assgn03AbstractMultiparaconst {
	public static void main(String[] args) {
		Assgn03College3 OAssgn03=new Assgn03College3("BIT");
	}

}
