package com.sgtesting.noargsconstructorpracticeprograms;


class Fruits
{
	String fName1;
	String fName2;
	String fName3;
	int fPrice1;
	int fPrice2;
	int fPric3;
	Fruits()
	{
		fName1="Apple";
		fName2="Orange";
		fName3="Mango";
		fPric3=100;
		fPrice1=199;
		fPrice2=788;
		System.out.println(fName1);
		System.out.println(fName2);
		System.out.println(fName3);
		System.out.println(fPric3);
		System.out.println(fPrice1);
		System.out.println(fPrice2);
		System.out.println("-------------------------");
	}
}
class Flower
{
	String flName1;
	String flName2;
	String flName3;
	int flPrice1;
	int flPrice2;
	int flPric3;
	Flower()
	{
		
		flName1="Rose";
		flName2="Jasmine";
		flName3="Tulip";
		flPric3=100;
		flPrice1=200;
		flPrice2=300;
		System.out.println(flName1);
		System.out.println(flName2);
		System.out.println(flName3);
		System.out.println(flPric3);
		System.out.println(flPrice1);
		System.out.println(flPrice2);
		System.out.println("-------------------------");
	}
}
class Vegetable
{
	String vName1;
	String vName2;
	String vName3;
	int vPrice1;
	int vPrice2;
	int vPric3;
	Vegetable()
	{
		
		vName1="Tomato";
		vName2="Lemon";
		vName3="Carrot";
		vPric3=66;
		vPrice1=99;
		vPrice2=33;
		System.out.println(vName1);
		System.out.println(vName2);
		System.out.println(vName3);
		System.out.println(vPric3);
		System.out.println(vPrice1);
		System.out.println(vPrice2);
	}
}
public class Assgn05NoArgsConstructor {

	public static void main(String[] args) {
		Fruits obj1=new Fruits();
		
		Flower obj2=new Flower();
		
		Vegetable obj3=new Vegetable();
	}

}
