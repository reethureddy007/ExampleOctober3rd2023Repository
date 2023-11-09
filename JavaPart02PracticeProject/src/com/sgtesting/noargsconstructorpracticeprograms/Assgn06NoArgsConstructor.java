package com.sgtesting.noargsconstructorpracticeprograms;

class Laptop
{
	String lName;
	String lType;
	int lPrice;
	int lTotal;
	Laptop()
	{
		
		lName="Lenovo";
		lPrice=6777787;
		lTotal=6778;
		lType="Wifi";
		System.out.println(lName);
		System.out.println(lPrice);
		System.out.println(lTotal);
		System.out.println(lType);
		System.out.println("----------------------------------------");
	}
}
class Desktop
{
	String dName;
	String dType;
	int dPrice;
	int dTotal;
	Desktop()
	{
		
		dName="Samsung";
		dPrice=57565;
		dTotal=58644;
		dType="LAN";
		System.out.println(dName);
		System.out.println(dPrice);
		System.out.println(dTotal);
		System.out.println(dType);
		System.out.println("----------------");
	}
}
class Mobile
{
	String mName;
	String mType;
	int mPrice;
	int mTotal;
	Mobile()
	{
		
		mName="Motorola";
		mPrice=46540;
		mTotal=756;
		mType="Wifi";
		System.out.println(mName);
		System.out.println(mPrice);
		System.out.println(mTotal);
		System.out.println(mType);
	}
}
public class Assgn06NoArgsConstructor {

	public static void main(String[] args) {
		Laptop obj1=new Laptop();
		
		Desktop obj2=new Desktop();
		
		Mobile obj3=new Mobile();
	}

}
