//create class for fruit, flower, vegetable & execute each members of class.
package com.sgtesting.practiceprogramsclassobject;
class Fruits
{
	String fName1;
	String fName2;
	String fName3;
	int fPrice1;
	int fPrice2;
	int fPric3;
}
class Flower
{
	String flName1;
	String flName2;
	String flName3;
	int flPrice1;
	int flPrice2;
	int flPric3;
}
class Vegetable
{
	String vName1;
	String vName2;
	String vName3;
	int vPrice1;
	int vPrice2;
	int vPric3;
}
public class Assgn05Object {

	public static void main(String[] args) {
		Fruits obj1=new Fruits();
		obj1.fName1="Apple";
		obj1.fName2="Orange";
		obj1.fName3="Mango";
		obj1.fPric3=100;
		obj1.fPrice1=199;
		obj1.fPrice2=788;
		System.out.println(obj1.fName1);
		System.out.println(obj1.fName2);
		System.out.println(obj1.fName3);
		System.out.println(obj1.fPric3);
		System.out.println(obj1.fPrice1);
		System.out.println(obj1.fPrice2);
		System.out.println("-------------------------");
		
		Flower obj2=new Flower();
		obj2.flName1="Rose";
		obj2.flName2="Jasmine";
		obj2.flName3="Tulip";
		obj2.flPric3=100;
		obj2.flPrice1=200;
		obj2.flPrice2=300;
		System.out.println(obj2.flName1);
		System.out.println(obj2.flName2);
		System.out.println(obj2.flName3);
		System.out.println(obj2.flPric3);
		System.out.println(obj2.flPrice1);
		System.out.println(obj2.flPrice2);
		System.out.println("-------------------------");
		
		Vegetable obj3=new Vegetable();
		obj3.vName1="Tomato";
		obj3.vName2="Lemon";
		obj3.vName3="Carrot";
		obj3.vPric3=66;
		obj3.vPrice1=99;
		obj3.vPrice2=33;
		System.out.println(obj3.vName1);
		System.out.println(obj3.vName2);
		System.out.println(obj3.vName3);
		System.out.println(obj3.vPric3);
		System.out.println(obj3.vPrice1);
		System.out.println(obj3.vPrice2);
	}

}
