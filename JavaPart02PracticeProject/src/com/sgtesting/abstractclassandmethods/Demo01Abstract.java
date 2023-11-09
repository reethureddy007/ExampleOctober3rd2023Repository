package com.sgtesting.abstractclassandmethods;
//Create instance or object based on the abstract class reference
abstract class Demo1College
{
	abstract void showDemo1CollegeName(String name);
	abstract void showDemo1CollegeLocation(String location);
	void displayDemo1Courses(String courses[])
	{
		System.out.println("Courses are ...");
		for(int i=0;i<courses.length;i++)
		{
			System.out.println("course name :"+courses[i]);
		}
	}
}
class Demo1EngineeringCollege extends Demo1College
{
	void showDemo1CollegeName(String name)
	{
		System.out.println("Engineering college name :"+name);
	}
	void showDemo1CollegeLocation(String location)
	{
		System.out.println("College location :"+location);
	}
	void showDemo1CityName(String name)
	{
		System.out.println("City name :"+name);
	}
	
}
public class Demo01Abstract {

	public static void main(String[] args) {
		Demo1EngineeringCollege ODemo1=new Demo1EngineeringCollege();
		ODemo1.showDemo1CollegeName("BIT");
		ODemo1.showDemo1CollegeLocation("Basavanagudi");
		ODemo1.showDemo1CityName("Bangalore");
	}

}
