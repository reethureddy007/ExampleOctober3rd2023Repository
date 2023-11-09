package com.sgtesting.inheritance;
//WAP hybrid inheritance, superclass contains contructor overloading.
class Add01
{
	Add01(int num1, int num2,int num12)
	{
		System.out.println(num1+num2+num12);
	}
	Add01(int num3, int num4)
	{
		System.out.println(num3+num4);
	}
}
class Maths02 extends Add01
{
	Maths02(int num5, int num6,int num13)
	{
		super(num5, num6,num13);
	}
	Maths02(int num7,int num8)
	{
		super(num7, num8);
	}
}
class Maths03 extends Maths02
{
	Maths03(int num8, int num9,int num14)
	{
		super(num8, num9, num14);
	}
	Maths03(int num10, int num11)
	{
		super(num10, num11);
	}
}
class Maths04 extends Add01
{
	Maths04(int num15,int num16,int num17)
	{
		super(num15, num16, num17);
	}
	Maths04(int num18, int num19)
	{
		super(num18, num19);
	}
}
public class Assgn07Hybridsuperconstover {

	public static void main(String[] args) {
		Maths04 assgn070=new Maths04(1, 10);
		Maths04 assgn071=new Maths04(10, 20, 30);
		Maths03 assgn072=new Maths03(100, 200);
		Maths03 assgn073=new Maths03(10000, 20000, 30000);
	}

}
