package com.sgtesting.constructorchaining;
//WAC, accept 2D char array as parameter, in constructor all elements of 2D array assign to 1D array & read elements.
class Demo03
{
	Demo03(char a[][])
	{
		char b[]=new char[a.length * a[0].length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[k]=a[i][j];
				k++;
			}
		}
		for(int m=0;m<b.length;m++)
		{
			System.out.println(b[m]);
		}
	}
}
public class Demo03ContructorChaining {

	public static void main(String[] args) {
		char arr[][]= {{'a','b','c'},{'d','e','f'}};
		Demo03 obj03=new Demo03(arr);
	}

}
