package com.sgtesting.constructorchaining;
class College
{
	College(String name)
	{
		System.out.println(name);
	}
	College(int branchCount)
	{
		this("BIT");
		System.out.println(branchCount);
	}
}
public class Demo01ContructorChaining {

	public static void main(String[] args) {
		College obj01=new College(2);
	}

}
