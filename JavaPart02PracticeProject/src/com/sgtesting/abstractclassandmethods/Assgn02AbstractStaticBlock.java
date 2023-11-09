package com.sgtesting.abstractclassandmethods;
//If Abstract class contains static block alone,WAP to execute static block.
abstract class Assgn02College1
{
	static
	{
		System.out.println("It is static block");
	}
}
class Assgn02College2 extends Assgn02College1
{
	
}
public class Assgn02AbstractStaticBlock {

	public static void main(String[] args) {
		Assgn02College1 OAssgn02=new Assgn02College2();
	}

}
