//Access multiple variables in multiple classes.
package com.sgtesting.practiceprogramsclassobject;
class Human1
{
	String firtsName;
	int age;
}
class Product
{
	String productName;
	String manufacturer;
}
class Birds
{
	String featherColour;
	int noOfWings;
}
class DomesticAnimals
{
	String quantityOfMilkProvided;
	String breedName;
}
public class ObjectDemo04 {

	public static void main(String[] args) {
		Human1 obj1=new Human1();
		obj1.firtsName="Reethan";
		obj1.age=29;
		System.out.println(obj1.firtsName);
		System.out.println(obj1.age);
		System.out.println("-----------------------------------------------");
		Product obj2=new Product();
		obj2.productName="Car";
		obj2.manufacturer="Maruti Suzuki";
		System.out.println(obj2.productName);
		System.out.println(obj2.manufacturer);
		System.out.println("------------------------------------------------");
		Birds obj3=new Birds();
		obj3.featherColour="Black";
		obj3.noOfWings=2;
		System.out.println(obj3.featherColour);
		System.out.println(obj3.noOfWings);
		System.out.println("-------------------------------------------------");
		DomesticAnimals obj4=new DomesticAnimals();
		obj4.breedName="Jersey";
		obj4.quantityOfMilkProvided="5 Liters";
		System.out.println(obj4.breedName);
		System.out.println(obj4.quantityOfMilkProvided);
		System.out.println("--------------------------------------------------");
	}

}
