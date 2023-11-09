package com.sgtesting.constructorchaining;
//By using constructor overloading & by applying 2 integer parameters, perform all basic mathematical operations.
class Demo06
{
	Demo06(int x, int y, String action)
	{
		int res=0;
		switch(action)
		{
		case "add":
			res=(x+y);
			System.out.println("add :"+res);
			break;
		case "sub":
			res=(x-y);
			System.out.println("substraction :"+res);
			break;
		case "mult":
			res=(x*y);
			System.out.println("multiplication :"+res);
			break;
		case "div":
			res=(x/y);
			System.out.println("Division :"+res);
			break;
			default:
				System.out.println("Invalid");
		}
	}
}
public class Demo06ConstructorChaining {

	public static void main(String[] args) {
		Demo06 obj060=new Demo06(100, 20, "add");
		Demo06 obj061=new Demo06(100, 20, "sub");
		Demo06 obj062=new Demo06(100, 20, "mult");
		Demo06 obj063=new Demo06(100, 20, "div");
	}

}
