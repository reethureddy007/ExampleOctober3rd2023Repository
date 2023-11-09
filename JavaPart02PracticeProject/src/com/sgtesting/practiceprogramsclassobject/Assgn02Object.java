//Create a class for product, order, items & execute each class member with minimum 4 variables
package com.sgtesting.practiceprogramsclassobject;
class Product1
{
	String name;
	String type;
	int price;
	int totalnoofProducts;
}
class Order
{
	String orderType;
	int orderPrice;
	int totalOrders;
	int orderNumebr;
}
class Items
{
	String itemName;
	int totalItems;
	int itemnumber;
	String itemType;
}
public class Assgn02Object {

	public static void main(String[] args) {
		Product1 prod=new Product1();
		prod.name="iPhone";
		prod.price=100000;
		prod.totalnoofProducts=100000;
		prod.type="phone";
		System.out.println(prod.name);
		System.out.println(prod.price);
		System.out.println(prod.totalnoofProducts);
		System.out.println(prod.type);
		System.out.println("------------------------------------------------------------");
		
		Order obj=new Order();
		obj.orderNumebr=1234;
		obj.orderPrice=100000;
		obj.orderType="Electronic";
		obj.totalOrders=100;
		System.out.println(obj.orderNumebr);
		System.out.println(obj.orderPrice);
		System.out.println(obj.orderType);
		System.out.println(obj.totalOrders);
		System.out.println("-------------------------------------------------------------");
		
		Items obj1=new Items();
		obj1.itemName="iPhone13";
		obj1.itemnumber=1234545;
		obj1.itemType="Mobile";
		obj1.totalItems=100;
		System.out.println(obj1.itemName);
		System.out.println(obj1.itemnumber);
		System.out.println(obj1.itemType);
		System.out.println(obj1.totalItems);
	}

}
