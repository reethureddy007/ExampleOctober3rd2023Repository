package com.sgtesting.parameterizedconstructorpracticeprograms;

class Human1
{
	String firtsName;
	int age;
	Human1(String fn, int Age)
	{
		firtsName=fn;
		age=Age;
		System.out.println(firtsName);
		System.out.println(age);
		System.out.println("-----------------------------------------------");
	}
}
class Product
{
	String productName;
	String manufacturer;
	Product(String product, String manuf)
	{
		productName=product;
		manufacturer=manuf;
		System.out.println(productName);
		System.out.println(manufacturer);
		System.out.println("------------------------------------------------");
	}
}
class Birds
{
	String featherColour;
	int noOfWings;
	Birds(String fcolour, int Wings)
	{
		featherColour=fcolour;
		noOfWings=Wings;
		System.out.println(featherColour);
		System.out.println(noOfWings);
		System.out.println("-------------------------------------------------");
	}
}
class DomesticAnimals
{
	String quantityOfMilkProvided;
	String breedName;
	DomesticAnimals(String qMilk, String breed)
	{
		breedName=qMilk;
		quantityOfMilkProvided=breed;
		System.out.println(breedName);
		System.out.println(quantityOfMilkProvided);
		System.out.println("--------------------------------------------------");
	}
}

public class Demo01ParameterizedConstructor {

	public static void main(String[] args) {
		Human1 obj1=new Human1("Reethan", 29);
		
		Product obj2=new Product("Car","BMW");
		
		Birds obj3=new Birds("Grey", 2);
		
		DomesticAnimals obj4=new DomesticAnimals("Cow","5 ltrs");
	}

}
