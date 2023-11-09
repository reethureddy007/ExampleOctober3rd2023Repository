package com.sgtesting.parameterizedconstructorpracticeprograms;


class Product1
{
	String name;
	String type;
	int price;
	int totalnoofProducts;
	Product1(String Name, String Type, int Price, int Total)
	{
		
		name=Name;
		type=Type;
		price=Price;
		totalnoofProducts=Total;
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
		System.out.println(totalnoofProducts);
		System.out.println("------------------------------------------------------------");
	}
}
class Order
{
	String orderType;
	int orderPrice;
	int totalOrders;
	int orderNumebr;
	Order(String Order, int Price1, int total1, int num)
	{
		orderType=Order;
		orderPrice=Price1;
		totalOrders=total1;
		orderNumebr=num;
		
		System.out.println(orderType);
		System.out.println(orderPrice);
		System.out.println(totalOrders);
		System.out.println(orderNumebr);
		System.out.println("-------------------------------------------------------------");
	}
}
class Items
{
	String itemName;
	int totalItems;
	int itemnumber;
	String itemType;
	Items(String name, int total2, int item2, String type2)
	{
		itemName=name;
		totalItems=total2;
		itemnumber=item2;
		itemType=type2;
		
		System.out.println(itemName);
		System.out.println(totalItems);
		System.out.println(itemnumber);
		System.out.println(itemType);
		
	}
}

public class Assgn02ParameterizedConstructor {

	public static void main(String[] args) {
		Product1 prod=new Product1("iphone","phone",100000,100000);
		
		Order obj=new Order( "Electronic",1234, 100000, 100);
		
		Items obj1=new Items("iPhone13",1234545,100,"mobile");
		
	}

}
