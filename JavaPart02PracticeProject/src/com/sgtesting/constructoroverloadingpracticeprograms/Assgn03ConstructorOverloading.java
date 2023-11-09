package com.sgtesting.constructoroverloadingpracticeprograms;
//By using constructor overloading create below examination class.
class Examination
{
	Examination(String ename)
	{
		System.out.println("exam name: "+ename);
		System.out.println("---------------------------");
	}
	Examination(String ename, String etype)
	{
		System.out.println("Exam name: "+ename);
		System.out.println("Exam tyoe: "+etype);
		System.out.println("---------------------------");
	}
	Examination(int papers,int students)
	{
		System.out.println(papers);
		System.out.println(students);
		System.out.println("--------------------");
	}
}
public class Assgn03ConstructorOverloading {

	public static void main(String[] args) {
		Examination obj1=new Examination("School");
		Examination obj2=new Examination("School","annual");
		Examination obj3=new Examination(10,1000);
	}

}
