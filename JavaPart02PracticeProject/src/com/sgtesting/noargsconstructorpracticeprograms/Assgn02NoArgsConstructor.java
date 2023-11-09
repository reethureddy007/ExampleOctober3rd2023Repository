package com.sgtesting.noargsconstructorpracticeprograms;


class Product1
{
	String name;
	String type;
	int price;
	int totalnoofProducts;
	Product1()
	{
		
		name="iPhone";
		price=100000;
		totalnoofProducts=100000;
		type="phone";
		System.out.println(name);
		System.out.println(price);
		System.out.println(totalnoofProducts);
		System.out.println(type);
		System.out.println("------------------------------------------------------------");
	}
}
class Order
{
	String orderType;
	int orderPrice;
	int totalOrders;
	int orderNumebr;
	Order()
	{
		orderNumebr=1234;
		orderPrice=100000;
		orderType="Electronic";
		totalOrders=100;
		System.out.println(orderNumebr);
		System.out.println(orderPrice);
		System.out.println(orderType);
		System.out.println(totalOrders);
		System.out.println("-------------------------------------------------------------");
	}
}
class Items
{
	String itemName;
	int totalItems;
	int itemnumber;
	String itemType;
	Items()
	{
		itemName="iPhone13";
		itemnumber=1234545;
		itemType="Mobile";
		totalItems=100;
		System.out.println(itemName);
		System.out.println(itemnumber);
		System.out.println(itemType);
		System.out.println(totalItems);
	}
}
public class Assgn02NoArgsConstructor {

	public static void main(String[] args) {
		Product1 prod=new Product1();
		
		Order obj=new Order();
		
		Items obj1=new Items();
		
	}

}
