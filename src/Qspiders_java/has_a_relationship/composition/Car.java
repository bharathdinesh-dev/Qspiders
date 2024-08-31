package Qspiders_java.relationship;

public class Car {
	//states
	private String name,color;
	private double price;
	private static String owner="Bharath";
//	Engine e=new Engine("4 stroke",400);
	private Engine e;
	//constructor
	private Car()
	{}
	
	private Car(String name,String color,double price,Engine e) {
		//n.i
		
		this.name=name;
		this.color=color;
		this.price=price;
		this.e=e;
	}
	
	//methods
	private void carDetails() {
		System.out.println("\t\tDetails of the Car");
		System.out.println("Car name : "+ name);
		System.out.println("Car color : "+ color);
		System.out.println("Car price : "+ price);
		System.out.println("Car owner : "+ owner);
	}
	
	//helper Methods
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public double getPrice() {
		return price;
	}
	public String getOwner() {
		return owner;
	}
	public static Car getcarObj() {
		return new Car();
	}
	public Engine getE() {
		return e;
	}
	public void getCarDetails() {
		carDetails();
	}
	public static Car getcarObj(String name,String color,double price,Engine e) {
		return new Car(name,color,price,e);
	}
	
	
}
