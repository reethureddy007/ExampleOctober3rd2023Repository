//create class for desktop, laptop, mobile & execute each members of class.
package com.sgtesting.practiceprogramsclassobject;
class Laptop
{
	String lName;
	String lType;
	int lPrice;
	int lTotal;
}
class Desktop
{
	String dName;
	String dType;
	int dPrice;
	int dTotal;
}
class Mobile
{
	String mName;
	String mType;
	int mPrice;
	int mTotal;
}
public class Assgn06Object {

	public static void main(String[] args) {
		Laptop obj1=new Laptop();
		obj1.lName="Lenovo";
		obj1.lPrice=6777787;
		obj1.lTotal=6778;
		obj1.lType="Wifi";
		System.out.println(obj1.lName);
		System.out.println(obj1.lPrice);
		System.out.println(obj1.lTotal);
		System.out.println(obj1.lType);
		System.out.println("----------------------------------------");
		
		Desktop obj2=new Desktop();
		obj2.dName="Samsung";
		obj2.dPrice=57565;
		obj2.dTotal=58644;
		obj2.dType="LAN";
		System.out.println(obj2.dName);
		System.out.println(obj2.dPrice);
		System.out.println(obj2.dTotal);
		System.out.println(obj2.dType);
		System.out.println("----------------");
		
		Mobile obj3=new Mobile();
		obj3.mName="Motorola";
		obj3.mPrice=46540;
		obj3.mTotal=756;
		obj3.mType="Wifi";
		System.out.println(obj3.mName);
		System.out.println(obj3.mPrice);
		System.out.println(obj3.mTotal);
		System.out.println(obj3.mType);
	}

}
