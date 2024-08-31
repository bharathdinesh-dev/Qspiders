package Qspiders_java.relationship.aggregation;

public class Sim {
	//states
	String operator,bandWidth;
	double price;
	
	//constructor
	Sim(){}
	
	Sim(String operator,String bandWidth,double price){
		//NI
		this.operator=operator;
		this.bandWidth=bandWidth;
		this.price=price;
	}
	
	//methods
	public void detailsOfSim() {
		System.out.println("Operator : "+operator);
		System.out.println("BandWidth : "+bandWidth);
		System.out.println("Price : "+price);
	}
	
	//helper Methods

}
