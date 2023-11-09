package com.sgtesting.inheritance;
//WAP for multilevel inheritance, super class contains parameterized constructor.
class AA
{
	AA(int nnumber)
	{
		System.out.println("super class :"+nnumber);
	}
}
class BB extends AA
{
	BB(int nnumber, String val)
	{
		super(nnumber);
		System.out.println("print the value"+val);
	}
}
class CC extends BB
{
	CC(int nnumber, String val)
	{
		super(nnumber, val);
	}
}
public class Assgn04SuperMulti {

	public static void main(String[] args) {
		CC assgn03=new CC(10, "reddy");
	}

}
