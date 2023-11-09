package com.sgtesting.methodswithparameter;
//1)WAM for given number find factorial.
class Assgn01
{
	void factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
		System.out.println("----------------------------------------------------------");
	}
}
//2) WAM to display numbers b/w 100 to 50 divisible by 3
class Assgn02
{
	void divisibleBy3(int num)
	{
		for(int i=100;i>=50;i--)
		{
			if(i%num==0)
			{
				System.out.println(i);
			}
		}
	}
}
//3) WAM perform add of 2D matrix
class Assgn03
{
	void addMatrix(int a[][], int b[][])
	{
		int res[][]=new int[a.length][a[0].length];
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}

//4) WAM given number is prime or not
class Assgn04
{
	void methodPrime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
			if(num%i==0)
			{
				flag+=1;
			}
		if(flag==0)
		{
			System.out.println(num+" is prime");
		}
		else
		{
			System.out.println(num+" is not prime");
		}
	}
}
public class MethodsParamAssgn01 {

	public static void main(String[] args) {
		//1)WAM for given number find factorial.
		Assgn01 obj01=new Assgn01();
		obj01.factorial(5);
		obj01.factorial(10);

		//2) WAM to display numbers b/w 100 to 50 divisible by 3
		Assgn02 obj02=new Assgn02();
		obj02.divisibleBy3(3);

		//3) WAM perform add of 2D matrix
		int x[][]= {{1,2,3},{4,5,6}};
		int y[][]= {{7,8,9},{10,11,12}};
		Assgn03 obj03=new Assgn03();
		obj03.addMatrix(x, y);

		//4) WAM given number is prime or not
		Assgn04 obj04=new Assgn04();
		obj04.methodPrime(6);
	}
}
