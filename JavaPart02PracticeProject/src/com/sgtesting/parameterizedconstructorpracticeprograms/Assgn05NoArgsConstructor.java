package com.sgtesting.parameterizedconstructorpracticeprograms;

class Fruits
{
	String fName1;
	String fName2;
	String fName3;
	int fPrice1;
	int fPrice2;
	int fPric3;
	Fruits(String fname1,String fname2,String fname3,int fprice1,int fprice2,int fprice3)
	{
		fName1=fname1;
		fName2=fname2;
		fName3=fname3;
		fPrice1=fprice1;
		fPrice2=fprice2;
		fPric3=fprice3;
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
	Flower(String flname1,String flname2,String flname3,int flprice1,int flprice2,int flprice3)
	{
		
		flName1=flname1;
		flName2=flname2;
		flName3=flname3;
		flPric3=flprice1;
		flPrice1=flprice2;
		flPrice2=flprice3;
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
	Vegetable(String vname1,String vname2,String vname3,int vprice1,int vprice2,int vprice3)
	{
		
		vName1=vname1;
		vName2=vname2;
		vName3=vname3;
		vPric3=vprice3;
		vPrice1=vprice1;
		vPrice2=vprice2;
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
		Fruits obj1=new Fruits("Mango","Apple","Custard",100,200,300);
		
		Flower obj2=new Flower("Tulip","Rose","Lavender",100,200,300);
		
		Vegetable obj3=new Vegetable("Tomato","Lemon","Carrot",66,99,33);
	}

}
