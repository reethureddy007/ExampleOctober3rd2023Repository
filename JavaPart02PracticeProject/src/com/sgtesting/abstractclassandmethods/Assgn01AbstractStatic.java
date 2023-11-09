package com.sgtesting.abstractclassandmethods;
//If Abstract class contains only 2 static methods, WAP to execute static methods from Abstract class
abstract class Assgn01College1
{
	static void assgn01display1(String name)
	{
		System.out.println(name);
	}
	static int assgn01display2(int num)
	{
		return num;
	}
}
public class Assgn01AbstractStatic {
	public static void main(String[] args) {
		Assgn01College1.assgn01display1("BIT");
		System.out.println(Assgn01College1.assgn01display2(1));
	}

}
