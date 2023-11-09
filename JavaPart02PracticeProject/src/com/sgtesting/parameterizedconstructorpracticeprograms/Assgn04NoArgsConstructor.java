package com.sgtesting.parameterizedconstructorpracticeprograms;

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
	Country(String cname, String cflag,int cpop,int cmen,int cwomen,int cvote,int cchild,String clang)
	{
		countryName=cname;
		countryFlag=cflag;
		countryPopulation=cpop;
		totalmen=cmen;
		totalwomen=cwomen;
		totalVoters=cvote;
		totalChildren=cchild;
		countryLanguage=clang;
		
		System.out.println(countryName);
		System.out.println(countryFlag);
		System.out.println(countryPopulation);
		System.out.println(totalmen);
		System.out.println(totalwomen);
		System.out.println(totalVoters);
		System.out.println(totalChildren);
		System.out.println(countryLanguage);
		
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
	State(String sname, String sflag1, String slang,int spop,int smen,int swomen,int svote,int schild)
	{
		
		stateName=sname;
		stateFlag=sflag1;
		Statelanguage=slang;
		statePopulation=spop;
		stateMen=smen;
		stateWomen=swomen;
		stateVoters=svote;
		stateChildren=schild;
		
		System.out.println(stateName);
		System.out.println(stateFlag);
		System.out.println(Statelanguage);
		System.out.println(statePopulation);
		System.out.println(stateMen);
		System.out.println(stateWomen);
		System.out.println(stateVoters);
		System.out.println(stateChildren);
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
	District(String dname,String dflag,String dlang,int dpop,int dmen,int dwomen,int vote,int child)
	{
		
		districtName=dname;
		districtFlag=dflag;
		districtlanguage=dlang;
		districtPopulation=dpop;
		districtMen=dmen;
		districtWomen=dwomen;
		districtVoters=vote;
		districtChildren=child;
		
		System.out.println(districtName);
		System.out.println(districtFlag);
		System.out.println(districtlanguage);
		System.out.println(districtPopulation);
		System.out.println(districtMen);
		System.out.println(districtWomen);
		System.out.println(districtVoters);
		System.out.println(districtChildren);
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
	Taluk(String tname, String tflag,String tlang,int tpop, int tmen, int twomen, int tvote, int tchild)
	{
		
		talukName=tname;
		talukFlag=tflag;
		taluklanguage=tlang;
		talukPopulation=tpop;
		talukMen=tmen;
		talukWomen=twomen;
		talukVoters=tvote;
		talukChildren=tchild;
		
		System.out.println(talukName);
		System.out.println(talukFlag);
		System.out.println(taluklanguage);
		System.out.println(talukPopulation);
		System.out.println(talukMen);
		System.out.println(talukWomen);
		System.out.println(talukVoters);
		System.out.println(talukChildren);
	}
}
public class Assgn04NoArgsConstructor {

	public static void main(String[] args) {
		Country obj1=new Country("India","Tri",10000000,5000000,5000000,34568,20000,"Hindi");
		
		State obj2=new State("Karnataka","Double","Kannada",10000000,100000,54677544,4667778,10000);
		
		District obj3=new District("Chikkaballapur","Double","Kannada",111234566,13456,423554,132453,1345);
		
		Taluk obj4=new Taluk("Chintamani","Double","Kannada",1325676,24335,8657,86789,12343);
	}

}
