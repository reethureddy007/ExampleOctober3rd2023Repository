package com.sgtesting.constructorchaining;
//Write a constructor, it should accept integer array as parameter & find sum of all elements.
class Demo02
{
	Demo02(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
public class Demo02ConstructorChaining {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		Demo02 obj02=new Demo02(a);
	}

}
