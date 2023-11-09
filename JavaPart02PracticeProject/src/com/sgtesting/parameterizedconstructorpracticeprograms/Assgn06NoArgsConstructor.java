package com.sgtesting.parameterizedconstructorpracticeprograms;


class Laptop
{
	String lName;
	String lType;
	int lPrice;
	int lTotal;
	Laptop(String lname,String ltype,int lprice,int ltotal)
	{
		
		lName=lname;
		lType=ltype;
		lPrice=lprice;
		lTotal=ltotal;
		
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
	Desktop(String dname,String dtype,int dprice,int dtotal)
	{
		
		dName=dname;
		dType=dtype;
		dPrice=dprice;
		dTotal=dtotal;
		
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
	Mobile(String mname,String mtype,int mprice,int mtotal)
	{
		
		mName=mname;
		mType=mtype;
		mPrice=mprice;
		mTotal=mtotal;
		
		System.out.println(mName);
		System.out.println(mType);
		System.out.println(mPrice);
		System.out.println(mTotal);
		
	}
}
public class Assgn06NoArgsConstructor {

	public static void main(String[] args) {
		Laptop obj1=new Laptop("Sony","Vaio",764784,758758);
		
		Desktop obj2=new Desktop("Samsung","Desktop",3464748,437458549);
		
		Mobile obj3=new Mobile("Motorola","wifi",567898,467);
	}

}
