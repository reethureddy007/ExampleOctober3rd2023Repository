package com.sgtesting.constructorchaining;
//Fibnoncci numbers
class Demo05
{
	Demo05()
	{
		int fn=0;
		System.out.println(fn);
		int sn=1;
		System.out.println(sn);
		int tn=0;
		for(int i=1;i<=10;i++)
		{
			tn=fn+sn;
			System.out.println(tn);
			fn=sn;
			sn=tn;
		}
	}
}
public class Demo05ConstructorChaining {

	public static void main(String[] args) {
		Demo05 obj05=new Demo05();
	}

}
