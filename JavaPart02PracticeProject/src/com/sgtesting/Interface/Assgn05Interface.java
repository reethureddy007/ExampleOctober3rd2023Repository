package com.sgtesting.Interface;
//WAP to demonstrate an interface contains variable and execute those variables.
interface Family
{
	int totalmen=10;
	int totalwomen=5;
	String fname="Reddy";
}
public class Assgn05Interface {
	public static void main(String[] args) {
		System.out.println("Family total men :"+Family.totalmen);
		System.out.println("----------------------------------");
		System.out.println("Family total women:"+Family.totalwomen);
		System.out.println("==================================");
		System.out.println("Family name:"+Family.fname);
	}

}
