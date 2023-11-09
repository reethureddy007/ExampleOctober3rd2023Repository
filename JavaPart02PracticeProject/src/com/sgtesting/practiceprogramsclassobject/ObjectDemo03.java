//How to access instance variables outside the main class.
package com.sgtesting.practiceprogramsclassobject;
class Human
{
	String firstName;
	int age;
}
public class ObjectDemo03 {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.firstName="Reethan";
		obj.age=29;
		System.out.println(obj.firstName);
		System.out.println(obj.age);
	}

}
