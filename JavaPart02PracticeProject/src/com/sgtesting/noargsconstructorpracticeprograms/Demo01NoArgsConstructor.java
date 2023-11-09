package com.sgtesting.noargsconstructorpracticeprograms;

class Human1
{
	String firtsName;
	int age;
	Human1()
	{
		firtsName="Reethan";
		age=29;
		System.out.println(firtsName);
		System.out.println(age);
		System.out.println("-----------------------------------------------");
	}
}
class Product
{
	String productName;
	String manufacturer;
	Product()
	{
		productName="Car";
		manufacturer="Maruti Suzuki";
		System.out.println(productName);
		System.out.println(manufacturer);
		System.out.println("------------------------------------------------");
	}
}
class Birds
{
	String featherColour;
	int noOfWings;
	Birds()
	{
		featherColour="Black";
		noOfWings=2;
		System.out.println(featherColour);
		System.out.println(noOfWings);
		System.out.println("-------------------------------------------------");
	}
}
class DomesticAnimals
{
	String quantityOfMilkProvided;
	String breedName;
	DomesticAnimals()
	{
		breedName="Jersey";
		quantityOfMilkProvided="5 Liters";
		System.out.println(breedName);
		System.out.println(quantityOfMilkProvided);
		System.out.println("--------------------------------------------------");
	}
}
public class Demo01NoArgsConstructor {

	public static void main(String[] args) {
		Human1 obj1=new Human1();
		
		Product obj2=new Product();
		
		Birds obj3=new Birds();
		
		DomesticAnimals obj4=new DomesticAnimals();
	}

}
