package com.sgtesting.constructorchaining;
//Verify the given number is prime number or not.
class Demo04
{
	Demo04(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				flag+=1;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is prime");
		}
		else if(flag!=0)
		{
			System.out.println(num+" is not prime");
		}
	}
}
public class Demo04ConstructorChaining {

	public static void main(String[] args) {
		Demo04 obj04=new Demo04(10);
	}

}
