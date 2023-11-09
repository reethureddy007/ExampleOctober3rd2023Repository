package com.sgtesting.methodswithoutparameters;
//Method which don't accept parameter.
class DemoMethod01
{
	void MDemo01()
	{
		int x,y,res;
		x=10;
		y=20;
		res=x+y;
		System.out.println(res);
	}
}
public class MethodsNoParametersDemo01 {

	public static void main(String[] args) {
		DemoMethod01 obj01=new DemoMethod01();
		obj01.MDemo01();
		obj01.MDemo01();
	}

}
