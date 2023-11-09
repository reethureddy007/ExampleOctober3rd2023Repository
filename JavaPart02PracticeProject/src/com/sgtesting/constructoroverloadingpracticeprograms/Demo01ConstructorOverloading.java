package com.sgtesting.constructoroverloadingpracticeprograms;
class Student
{
	Student(String name)
	{
		System.out.println("Name: "+name);
		System.out.println("---------------------------");
	}
	Student(int age)
	{
		System.out.println("Age: "+age);
		System.out.println("----------------------------");
	}
	Student(String name,int age)
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println("-----------------------------");
	}
	Student(String name, int age, long fee)
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(fee);
	}
}
public class Demo01ConstructorOverloading {

	public static void main(String[] args) {
		Student obj1=new Student("Reethan");
		Student obj2=new Student(29);
		Student obj3=new Student("Reethan",29);
		Student obj4=new Student("Reethan",29,50000);
	}

}
