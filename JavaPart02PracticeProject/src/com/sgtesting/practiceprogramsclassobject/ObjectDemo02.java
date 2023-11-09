//Can we create multiple objects for the same class.
package com.sgtesting.practiceprogramsclassobject;

public class ObjectDemo02 {
	String firstName;
	int age;
	public static void main(String[] args) {
		ObjectDemo02 obj2=new ObjectDemo02();
		obj2.firstName="Reethan";
		obj2.age=29;
		System.out.println(obj2.firstName);
		System.out.println(obj2.age);
		System.out.println("------------------------");
		obj2.firstName="Surekha";
		obj2.age=28;
		System.out.println(obj2.firstName);
		System.out.println(obj2.age);
		System.out.println("----------------------");
	}

}
