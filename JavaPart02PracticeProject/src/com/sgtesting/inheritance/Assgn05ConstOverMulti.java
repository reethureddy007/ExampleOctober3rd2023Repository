package com.sgtesting.inheritance;
//WAP multilevel inheritance, superclass contains constructor overloading.
class Maths1
{
	Maths1(int num1)
	{
		System.out.println("Super class01"+num1);
	}
	Maths1(int num2, int num3)
	{
		System.out.println("Super class 02"+num2+num3);
	}
}
class Maths2 extends Maths1
{
	Maths2(int num1)
	{
		super(num1);
	}
	Maths2(int num2,int num3)
	{
		super(num2, num3);
	}
}
class Maths3 extends Maths2
{
	Maths3(int num1)
	{
		super(num1);
	}
	Maths3(int num2, int num3)
	{
		super(num2, num3);
	}
}
public class Assgn05ConstOverMulti {

	public static void main(String[] args) {
		Maths3 assgn05=new Maths3(10);
		Maths3 assgn005=new Maths3(10, 20);
	}

}
