package com.sgtesting.noargsconstructorpracticeprograms;

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
	Country()
	{
		
		countryFlag="Tri";
		countryLanguage="Hindi";
		countryName="India";
		countryPopulation=10000000;
		totalChildren=20000;
		totalmen=5000000;
		totalwomen=5000000;
		System.out.println(countryFlag);
		System.out.println(countryLanguage);
		System.out.println(countryName);
		System.out.println(countryPopulation);
		System.out.println(totalChildren);
		System.out.println(totalmen);
		System.out.println(totalVoters);
		System.out.println(totalwomen);
		System.out.println("-------------------------------------");
	}
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
	State()
	{
		
		stateChildren=10000;
		stateFlag="Double";
		Statelanguage="Kannada";
		stateMen=100000;
		stateName="Karnataka";
		statePopulation=10000000;
		stateVoters=4667778;
		stateWomen=54677544;
		System.out.println(stateChildren);
		System.out.println(stateFlag);
		System.out.println(Statelanguage);
		System.out.println(stateMen);
		System.out.println(stateName);
		System.out.println(statePopulation);
		System.out.println(stateVoters);
		System.out.println(stateWomen);
		System.out.println("-------------------------");
	}
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
	District()
	{
		
		districtChildren=1345;
		districtFlag="Double";
		districtlanguage="Kannada";
		districtMen=13456;
		districtName="Chikkaballapur";
		districtPopulation=111234566;
		districtVoters=132453;
		districtWomen=423554;
		System.out.println(districtChildren);
		System.out.println(districtFlag);
		System.out.println(districtlanguage);
		System.out.println(districtMen);
		System.out.println(districtName);
		System.out.println(districtPopulation);
		System.out.println(districtVoters);
		System.out.println(districtWomen);
		System.out.println("-----------------------------------------");
	}
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
	Taluk()
	{
		
		talukChildren=12343;
		talukFlag="Double";
		taluklanguage="Kannada";
		talukMen=24335;
		talukName="Chintamani";
		talukPopulation=1325676;
		talukVoters=86789;
		talukWomen=8657;
		System.out.println(talukChildren);
		System.out.println(talukFlag);
		System.out.println(taluklanguage);
		System.out.println(talukMen);
		System.out.println(talukName);
		System.out.println(talukPopulation);
		System.out.println(talukVoters);
		System.out.println(talukWomen);
	}
}
public class Assgn04NoArgsConstructor {

	public static void main(String[] args) {
		Country obj1=new Country();
		
		State obj2=new State();
		
		District obj3=new District();
		
		Taluk obj4=new Taluk();
	}

}
