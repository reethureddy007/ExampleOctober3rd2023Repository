package com.sgtesting.constructoroverloadingpracticeprograms;
//By using constructor overloading create below college class
class College
{
	College(String cname)
	{
		System.out.println("college name: "+cname);
		System.out.println("-----------------------------");
	}
	College(String cname, String address)
	{
		System.out.println("college name: "+cname);
		System.out.println("college address: "+address);
		System.out.println("----------------------------");
	}
	College(String cname,String address,long pincode)
	{
		System.out.println("college name: "+cname);
		System.out.println("college address: "+address);
		System.out.println("college pincode: "+pincode);
		System.out.println("-------------------------------");
	}
	College(int staff, int students)
	{
		System.out.println("total staff: "+staff);
		System.out.println("toatl students: "+students);
		System.out.println("-------------------------------");
	}
}
public class Assgn02ConstructorOverloading {

	public static void main(String[] args) {
		College obj1=new College("BIT");
		College obj2=new College("BIT","VV PURAM");
		College obj3=new College("BIT","VV PURAM",560040);
		College obj4=new College(1000,10000);
	}

}
