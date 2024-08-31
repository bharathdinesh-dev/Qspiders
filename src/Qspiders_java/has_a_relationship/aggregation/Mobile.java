package Qspiders_java.relationship.aggregation;

public class Mobile {
	//states
	String name,ram;
	double price;
	Sim tray=new Sim("Bsnl","5G",999);
	
	//constructor
	Mobile(){}
	
	Mobile(String name,String ram,double price,Sim tray){
		this.name=name;
		this.ram=ram;
		this.price=price;
		this.tray=tray;
		System.out.println("\nMobile inserted successfully...");
		
	}
	
	//methods
	public void detailsOfMobile() {
		System.out.println("Name : "+name);
		System.out.println("Ram : "+ram);
		System.out.println("Price : "+price);
		System.out.println("\n####### Sim ########");
		tray.detailsOfSim();
		
	}
	public void insertSim(Sim s) {
		if(tray==null) {
			tray=s;
			System.out.println(tray.operator+" sim inserted");
		}else {
			System.out.println(tray.operator+" sim already inserted");
		}
	}
	
	public void removeSim() {
		if(tray!=null) {
			System.out.println(tray.operator+" sim removed");
			tray=null;
			
		}else {
			System.out.println("Sim not found in the tray");
		}
	}
	
	public boolean isSimPresent() {
		return tray!=null;
	}
	
	//helper Methods

}
