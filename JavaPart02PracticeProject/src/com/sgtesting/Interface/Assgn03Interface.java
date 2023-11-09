package com.sgtesting.Interface;
//WAP to demonstrate one interface extends another interface at multilevel.
interface Brand
{
	void showBrandName(String name);
}
interface Type extends Brand
{
	void showType(String name);
}
interface Item extends Type
{
	void showItem(String name);
}
class Price implements Type
{
	public void showBrandName(String name)
	{
		System.out.println("Brand name :"+name);
	}
	public void showType(String name)
	{
		System.out.println("Type name :"+name);
	}
	public void showItem(String name)
	{
		System.out.println("Item name :"+name);
	}
	void showPrice(int val)
	{
		System.out.println("Price :"+val);
	}
}
public class Assgn03Interface {

	public static void main(String[] args) {
		Price OAssgn03=new Price();
		OAssgn03.showBrandName("Sony");
		OAssgn03.showType("Electronic");
		OAssgn03.showItem("Laptop");
		OAssgn03.showPrice(75000);
	}

}
