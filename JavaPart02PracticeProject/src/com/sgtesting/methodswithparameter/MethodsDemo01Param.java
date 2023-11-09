package com.sgtesting.methodswithparameter;
//Method with parameter
class ParaDemo01
{
	void P0Demo01(int age, String name)
	{
		System.out.println(age);
		System.out.println("------------------------");
		System.out.println(name);
		System.out.println("---------------------------------------------------------");
	}
	void P1Demo02(int x, int y)
	{
		int res=x+y;
		System.out.println("add :"+(x+y));
	}
}
public class MethodsDemo01Param {

	public static void main(String[] args) {
		ParaDemo01 object01=new ParaDemo01();
		object01.P0Demo01(30, "reethan");
		object01.P1Demo02(10, 30);
	}

}
