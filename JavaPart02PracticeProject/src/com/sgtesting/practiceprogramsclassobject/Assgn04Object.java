//Create class for country, state, district, taluk & execute each memebers of class.
package com.sgtesting.practiceprogramsclassobject;
class Country
{
	String countryName;
	String countryFlag;
	int countryPopulation;
	int totalmen;
	int totalwomen;
	int totalVoters;
	int totalChildren;
	String countryLanguage;
}
class State
{
	String stateName;
	String stateFlag;
	String Statelanguage;
	int statePopulation;
	int stateMen;
	int stateWomen;
	int stateVoters;
	int stateChildren;
}
class District
{
	String districtName;
	String districtFlag;
	String districtlanguage;
	int districtPopulation;
	int districtMen;
	int districtWomen;
	int districtVoters;
	int districtChildren;	
}
class Taluk
{
	String talukName;
	String talukFlag;
	String taluklanguage;
	int talukPopulation;
	int talukMen;
	int talukWomen;
	int talukVoters;
	int talukChildren;
}
public class Assgn04Object {

	public static void main(String[] args) {
		Country obj1=new Country();
		obj1.countryFlag="Tri";
		obj1.countryLanguage="Hindi";
		obj1.countryName="India";
		obj1.countryPopulation=10000000;
		obj1.totalChildren=20000;
		obj1.totalmen=5000000;
		obj1.totalwomen=5000000;
		System.out.println(obj1.countryFlag);
		System.out.println(obj1.countryLanguage);
		System.out.println(obj1.countryName);
		System.out.println(obj1.countryPopulation);
		System.out.println(obj1.totalChildren);
		System.out.println(obj1.totalmen);
		System.out.println(obj1.totalVoters);
		System.out.println(obj1.totalwomen);
		System.out.println("-------------------------------------");
		
		State obj2=new State();
		obj2.stateChildren=10000;
		obj2.stateFlag="Double";
		obj2.Statelanguage="Kannada";
		obj2.stateMen=100000;
		obj2.stateName="Karnataka";
		obj2.statePopulation=10000000;
		obj2.stateVoters=4667778;
		obj2.stateWomen=54677544;
		System.out.println(obj2.stateChildren);
		System.out.println(obj2.stateFlag);
		System.out.println(obj2.Statelanguage);
		System.out.println(obj2.stateMen);
		System.out.println(obj2.stateName);
		System.out.println(obj2.statePopulation);
		System.out.println(obj2.stateVoters);
		System.out.println(obj2.stateWomen);
		System.out.println("-------------------------");
		
		District obj3=new District();
		obj3.districtChildren=1345;
		obj3.districtFlag="Double";
		obj3.districtlanguage="Kannada";
		obj3.districtMen=13456;
		obj3.districtName="Chikkaballapur";
		obj3.districtPopulation=111234566;
		obj3.districtVoters=132453;
		obj3.districtWomen=423554;
		System.out.println(obj3.districtChildren);
		System.out.println(obj3.districtFlag);
		System.out.println(obj3.districtlanguage);
		System.out.println(obj3.districtMen);
		System.out.println(obj3.districtName);
		System.out.println(obj3.districtPopulation);
		System.out.println(obj3.districtVoters);
		System.out.println(obj3.districtWomen);
		System.out.println("-----------------------------------------");
		
		Taluk obj4=new Taluk();
		obj4.talukChildren=12343;
		obj4.talukFlag="Double";
		obj4.taluklanguage="Kannada";
		obj4.talukMen=24335;
		obj4.talukName="Chintamani";
		obj4.talukPopulation=1325676;
		obj4.talukVoters=86789;
		obj4.talukWomen=8657;
		System.out.println(obj4.talukChildren);
		System.out.println(obj4.talukFlag);
		System.out.println(obj4.taluklanguage);
		System.out.println(obj4.talukMen);
		System.out.println(obj4.talukName);
		System.out.println(obj4.talukPopulation);
		System.out.println(obj4.talukVoters);
		System.out.println(obj4.talukWomen);
	}

}
