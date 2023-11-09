package com.sgtesting.inheritance;
//WAP for ?Hierarchical inheritance super class contains parameterizerd constructor.
class ZZ
{
	ZZ(String val1)
	{
		System.out.println(val1);
	}
}
class YY extends ZZ
{
	YY(String val1)
	{
		super(val1);
	}
}
class XX extends YY
{
	XX(String val1)
	{
		super(val1);
	}
}
class WW extends ZZ
{
	WW(String val1)
	{
		super(val1);
	}
}
public class Assgn06Hierarcsuperpara {

	public static void main(String[] args) {
		XX assgn06=new XX("Java");
		WW assgn061=new WW("Python");
	}

}
